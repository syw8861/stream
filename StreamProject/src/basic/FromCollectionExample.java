package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Student
{
	private String name;
	private int score;

	public Student(String name, int score)
	{
		this.name = name;
		this.score = score;
	}

	public String getName()
	{
		return this.name;
	}

	public int getScore()
	{
		return this.score;
	}
}

public class FromCollectionExample
{
	public static void main(String[] args)
	{
		List<Student> students = Arrays.asList(new Student("Hong", 35),new Student("Kong", 36),new Student("dong", 37),new Student("fong", 38));
		
		Stream<Student> stream = students.stream();
		stream.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t)
			{
				System.out.println(t.getName()+","+ t.getScore());				
			}
		});
//		students.stream().forEach((t)-> System.out.println(t.getName() + "," + t.getScore())); 위에꺼 람다
		students.stream().filter(t-> t.getScore()>50);
		
		students.stream().forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t)
			{
				System.out.println(t.getName() + "," + t.getScore());
				
			}
			
		});
		
		}
	
}
