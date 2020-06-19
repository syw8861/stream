package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample3
{
	public static void main(String[] args)
	{
		int[] intAry = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 2, 3, 5, 2, 3, 2, 1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 2, 2, 3, 3, 4, 3,
				5, 2, 1, 23, 3, 2, 2, 2, 1, 23, 1, 23 };
		double[] doubleAry = {1.1, 2.2 , 3.3, 5.5, 6.1, 10.3, 11.3, 4.5};
		
		IntStream intstream = Arrays.stream(intAry);
		DoubleStream doublestream = Arrays.stream(doubleAry);
		
		doublestream=intstream.asDoubleStream();
		doublestream.forEach(s->System.out.print(s));
		System.out.println();
		intstream = Arrays.stream(intAry);
		intstream.asLongStream().forEach(System.out::print);
		System.out.println();
		intstream = Arrays.stream(intAry);
		Stream<Integer> iStream = intstream.boxed(); //int타입 스트림을 Integer타입으로 바꿔줌
		iStream.forEach(s->System.out.print(s));
		
	}
}
