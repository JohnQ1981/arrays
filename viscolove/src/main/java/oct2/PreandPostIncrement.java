package oct2;

import java.util.function.UnaryOperator;

public class PreandPostIncrement {

	public static void main(String[] args) {


		for(int i=0;i<5;i++) {
			System.out.println(++i);
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(i++);
			
		}
//		UnaryOperator<Integer> un1 = (final String x)-> x;

	}

}
