package intermediate;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class AggregateExample
{
	public static void main(String[] args)
	{
		
		long count = Arrays.stream(new int[] {1,2,3,4,5,8,10,12,16,18,22,28,30}).filter(new IntPredicate() {

			@Override
			public boolean test(int value)
			{
				return value%2==0;
			}
		}).count();
		System.out.println("2의 배수 개수: "+ count);
		
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter((n)->n%2==0).sum();
		System.out.println("2의 배수의 합:  "+sum);
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).average().getAsDouble();
		System.out.println("2의 배수의 평균:   "+avg);
		
		int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).max().getAsInt();
		System.out.println("2의 배수중에 최대인 값     "+ max);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%2==0).min().getAsInt();
		System.out.println("2의 배수중에 최소인 값     "+min);
		
		int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(n->n%3==0).findFirst().getAsInt();
		System.out.println("첫번째인 3의 배수인 값 :  "+first);
		
	}
}
