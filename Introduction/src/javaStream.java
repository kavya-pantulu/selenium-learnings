import java.util.ArrayList;

public class javaStream {

	//public void regular()
	{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Abhi");
	names.add("Kavya");
	names.add("Avik");
	names.add("Aaryu");
	int count=0;
	
	for(int i=0;i<names.size();i++)
		{
		String actual=names.get(i);
		if(actual.startsWith("A"))
				{
			count++;
				}
		}
	System.out.println(count);	
}
	
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhi");
		names.add("Kavya");
		names.add("Avik");
		names.add("Aaryu");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	
	Long d=Stream.of("Aaryu,"Avik","Kavya","Arun").filter(s->
			{
			  s.startsWith("A");
			  return true;
			}).count();
	System.out.println(d);
	
	
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));

}
