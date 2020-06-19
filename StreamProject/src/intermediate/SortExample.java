package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample
{
	public static void main(String[] args)
	{
		List<Student> students = Arrays.asList(new Student("Hong",33), new Student("SAA",20), new Student("WON",55));
		
		students.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.print("a".compareTo("f"));
		
		List<Person> person = Arrays.asList(new Person("KONG", 55), new Person("WANG", 44));
		
		person.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2)
			{
//				return o1.age - o2.age;
				return o1.name.compareTo(o2.name);
			}
		}).forEach(System.out::println);
	}
}
