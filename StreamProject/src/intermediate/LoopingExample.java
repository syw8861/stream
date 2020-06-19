package intermediate;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class LoopingExample
{
	public static void main(String[] args)
	{
		int[] intArr = {1,2,3,4,5,6,7,8,9,0};
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		
		Arrays.stream(intArr).filter(new IntPredicate() {

			@Override
			public boolean test(int value)
			{
				return value%2==0;
			}
			
		}).peek(new IntConsumer() {

			@Override
			public void accept(int value)
			{
				System.out.println(value);				
			}
			
		});//peek는 중간에 처리된걸 잠시 뿌려보는 역할임 peek뒤에는 최종처리가 와야함
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		
		int total = Arrays.stream(intArr).filter(a->a%2==0).peek(a->System.out.println(a)).sum();
		System.out.println("총합"+total);
		
		System.out.println("[foreach()를 마지막에 호출한 경우");
		Arrays.stream(intArr).filter(a->a%2==0).forEach(a->System.out.println(a));
	}
}
