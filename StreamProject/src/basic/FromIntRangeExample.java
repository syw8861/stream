package basic;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromIntRangeExample
{
	public static int sum;
	
	public static void main(String[] args)
	{
//		IntStream stream= IntStream.range(10, 100); //10~99만됌
//		IntStream stream1= IntStream.rangeClosed(10, 100); //10~100까지 다됌
//		
//		stream.forEach(new IntConsumer() {
//			@Override
//			public void accept(int value)
//			{
//				System.out.println(value);	
//			}
//		});
//		
//		stream1.filter(new IntPredicate() {
//			@Override
//			public boolean test(int value)
//			{
//				return (value % 2 == 1);	
//			}
////		}).forEach((t)-> System.out.println(t));
		
		Random random = new Random();
		
		IntStream stream2 = random.ints(10, 1, 100);
		
		stream2.filter((s)-> s>49&&s<60).forEach((t)->System.out.println(t));
		
		IntStream stream3 = random.ints(10, 1, 10);
		
		stream3.forEach((t)->System.out.println(t)); //중복값도 나옴
	}
}
