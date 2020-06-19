package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample2
{
	public static void main(String[] args)
	{
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.flatMap(t-> Stream.of(t * 2)).filter((t)->t > 3).forEach(s -> System.out.println(s));
		stream.close();
		
		stream = Stream.of(1, 2, 3);//한번 생성해주고 쓰고나면 끝이라서 새로 만들어줘야함
		int sum = stream.flatMapToInt(s-> IntStream.of(s*2)).sum();
		System.out.println(sum);
		
		List<Employee> employees = Employee.persons();
		
		employees.stream().flatMapToDouble(t->DoubleStream.of(t.getIncome())).filter(t->t<5000).forEach(s->System.out.println(s));
	}
}
