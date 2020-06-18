package intermediate;

import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample
{
	public static void main(String[] args)
	{
		Stream.of(1,2,3).flatMap(new Function<Integer, Stream<Integer>>(){ //input값  integer   리턴타입으로는 stream<integer>
			@Override
			public Stream<Integer> apply(Integer t)
			{
				return Stream.of(t, t*2, t/2, t*t); //t값이 여러개 들어가도 됌
			}
		}).forEach((s)->System.out.println(s));
		System.out.println();
//		Stream.of(2,3,4).flatMap((t)->Stream.of(t, t*2, t/2, t*t)).forEach((s)->System.out.println(s)); //위에거 람다식
			
		
		Stream.of(5,6,7).flatMapToInt(new Function<Integer, IntStream>(){
			@Override
			public IntStream apply(Integer t)
			{
				return IntStream.of(t*2);
			}
		}).forEach(s->System.out.println(s));
		
		
		System.out.println();
		OptionalDouble avg = Employee.persons().stream().flatMapToDouble(new Function<Employee, DoubleStream>(){
			@Override
			public DoubleStream apply(Employee t)
			{
				return DoubleStream.of(t.getIncome()*2);
			}	
		}).average();
		System.out.println(avg);
		
		
		System.out.println();
		double sum = Employee.persons().stream().flatMapToDouble(new Function<Employee, DoubleStream>(){
			@Override
			public DoubleStream apply(Employee t)
			{
				return DoubleStream.of(t.getIncome()*2);
			}	
		}).sum();
		System.out.println(sum);
	}
}
