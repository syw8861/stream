package lambdaExpression;

import java.util.function.UnaryOperator;

public class LambdaExample3
{
	public static void main(String[] args)
	{
		UnaryOperator<String> uo = new UnaryOperator<String>() {

			@Override
			public String apply(String t)
			{
//				return t.substring(t.length()-3); //뒤에서부터 3자리만
//				return t.toLowerCase();//가져온값을 소문자로 바꿔주는
				return t.toUpperCase();//가져온값을 대문자로
			
			}
			
		};
		System.out.println(uo.apply("Helloword"));
	}
}
