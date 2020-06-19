package intermediate;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class AggregateExample3
{
	public static void main(String[] args)
	{
		double aa = Employee.persons().stream().map(new Function<Employee, Double>(){
			@Override
			public Double apply(Employee t)
			{
				return t.getIncome();
			}
		}).reduce(0.0, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u)
			{	
				return t+u;
			}
		});
		System.out.println(aa);
		
		
		//)2) 위에서 한걸 reduce안에다가 바로 해보기
		double bb = Employee.persons().stream().reduce(1.1,new BiFunction<Double, Employee, Double>(){ 
			//BiFunction<초기값 , 가져온값 , 출력값>

			@Override
			public Double apply(Double t, Employee u)
			{
				System.out.println("t:  "+t);
				System.out.println("u:  "+u);
				return t+u.getIncome();
				
			}} , new BinaryOperator<Double>() {

			@Override
			public Double apply(Double t, Double u)
			{
				return t+u;
			}
			
		});
		System.out.println(bb);
		
	}
}
