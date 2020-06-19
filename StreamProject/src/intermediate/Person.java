package intermediate;

public class Person
{
	String name;
	int age;
	
	
	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString()
	{
		String str = String.format("%s %s", age, name);
		return str; 

	}
}
