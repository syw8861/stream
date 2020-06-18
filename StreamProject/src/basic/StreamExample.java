package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample
{
	static int sum=0;
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		for(int n:numbers) {
			if(n%2==1) {
				int square = n*n;
				sum += square;
				
			}
			
		}
		System.out.println(sum);
		
		
		Predicate<Integer> predicate = (t) -> t%2==1; //이거랑 밑에있는거랑 같은거임
//		Predicate<Integer> predicate = new Predicate<Integer>(){
//
//			@Override
//			public boolean test(Integer t)
//			{
//				return t % 2 ==1;
//			}
//		};
		
		numbers.stream().filter(predicate).forEach(s -> System.out.print(s)); //filter(predicate<<참인지 아닌지 판별해서 return해주겠다)
		System.out.println();
		numbers.stream().filter((t) -> t % 2==0).forEach(s -> System.out.print(s));//이거는 위에 저 람다식or풀어서 한거를 filter()<<<여기 안에다 넣어주는거
		System.out.println();
		
		
		
		Function<Integer, Integer> function = new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer t)
			{
				return t*t;
			}
			
		};
		
		numbers.stream().filter((t) -> t % 2==1).map(function).forEach(s -> sum += s);
//		numbers.stream().filter((t) -> t % 2==1).map(t -> t*t).forEach(s -> sum += s);
		System.out.println("결과"+ sum);
	}
}
