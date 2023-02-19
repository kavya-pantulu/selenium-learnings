package demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payload;
import Files.ReusableMethods;

public class Basics {

	public static void main(String[] args) {

		//validate add place
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		String response= given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).header("server", "Apache/2.4.18 (Ubuntu)").body("scope", equalTo("APP")).extract().response().asString();
		
		
		//Add place->update place with new address -> get place to validate if new address is present in response//
		System.out.println(response);
		JsonPath js= new JsonPath(response);  //for parsing json
		String placeId= js.getString("place_id");
		System.out.println(placeId);
		
		String newAddress= "70 winter walk, USA";
	   given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\n" + 
				"\"place_id\":\""+placeId+"\",\n" + 
				"\"address\":\""+newAddress+"\",\r\n"+
				"\"key\":\"qaclick123\"\n" + 
				"}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		String newAddedplace= given().log().all().queryParam("key","qaclick123").queryParam("place_id", "058c0b2bbb4e6be43313768d892a736f")
		.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js1= ReusableMethods.rawToJson(newAddedplace);
		String actualAddress= js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);
	}

}
