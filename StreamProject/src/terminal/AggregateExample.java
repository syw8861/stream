package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.IntStream;

public class AggregateExample
{
	public static void main(String[] args)
	{
		int[] intAry = { 1, 2, 3, 4, 5 };
		IntStream istream = Arrays.stream(intAry);

		OptionalDouble od = istream.filter(n -> n >= 5).average();
		double result;
//		
		//방법1
//		if(od.isPresent()) { //od에 값이 있는지 없는지 체크
//			result = od.getAsDouble();
//			System.out.println(result);
//		}
//		System.out.println("값이 없다.");
		
		//방법2
//		result = od.orElse(0);  //od에 값이 없으면 0으로 나타내줘라
//		System.out.println(result);
		
		//방법3
		od.ifPresent(new DoubleConsumer() { //결과가 있으면 출력하고 없으면 아무것도 안하고(에러가 안남)
			@Override
			public void accept(double value)
			{
				System.out.println("결과는"+ value);
			}
		});
	}
}
