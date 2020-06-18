package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class DistinctExample
{
	public static void main(String[] args)
	{
		IntStream is = IntStream.of(1,2,3,4,5,6,7,8,9,4,5,1,2,3,6,10);
		int sum;
		sum = is.distinct().peek(System.out::print).sum();
		System.out.println();
		System.out.println(sum);
		
		List<Student> list = Arrays.asList(new Student("Hong",33), new Student("Hwang", 44), new Student("Hong", 33), new Student("hong", 33));
		list.stream().distinct().forEach(s->System.out.println(s));
	}
}
