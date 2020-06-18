package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample
{
	public static void main(String[] args)
	{
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		inputList1.stream().flatMap(new Function<String, Stream<String>>()
		{

			@Override
			public Stream<String> apply(String t)
			{
				return Arrays.stream(t.split(" ")); // 공란을 기준으로 나누겠다.
			}
		}).forEach(new Consumer<String>()
		{
			@Override
			public void accept(String t)
			{
				System.out.println(t);
			}
		});

		List<String> inputList2 = Arrays.asList("rara hoho", "tktk qkqk"); // 이거랑 위에꺼랑 같음
		Stream<String> stream = inputList2.stream();
		stream.flatMap(new Function<String, Stream<String>>()
		{
			@Override
			public Stream<String> apply(String t)
			{
				String[] strAry = t.split(" ");
				return Arrays.stream(strAry);
			}
		}).forEach(t -> System.out.println(t));

		
		
		
		
		
		
		
		
		
		
		
		List<String> inputList3 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList3.stream().flatMapToInt(new Function<String, IntStream>()
		{
			@Override
			public IntStream apply(String t)
			{
				String[] strArr = t.split(",");// ,콤마를 기준으로 나누겠다.
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < strArr.length; i++)
				{
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			}
		}).forEach(new IntConsumer() //forEach(System.out::println);
		{
			@Override
			public void accept(int value)
			{
				System.out.println(value);
			}
		});
	}
}