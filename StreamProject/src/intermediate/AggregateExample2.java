package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;

public class AggregateExample2
{
	public static void main(String[] args)
	{
		List<Student> stt = Arrays.asList(new Student("A",99),new Student("B",89),new Student("C",79));
		
		int result = stt.stream().mapToInt(new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value)
			{
				return value.getScore();
			}
			
		}).sum();
		System.out.println(result);
		
		
		
		
		result= stt.stream().mapToInt(s->s.getScore()).reduce(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right)
			{
				System.out.println("left  "+left);
				System.out.println("right  "+right);
				return left+right;
			}		
		}).getAsInt();
		System.out.println(result);
		
		
		result = stt.stream().filter(n->n.getScore()>99).mapToInt(n->n.getScore()).reduce(0, new IntBinaryOperator() {
			//reduce(0 <<--에러가 나면 0이 초기값으로 설정한다)

			@Override
			public int applyAsInt(int left, int right)
			{
				return left+right;
			}
		});
		System.out.println("집계결과3 :  " +  result);
	}
}
