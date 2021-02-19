package oct2;

import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two digits");
		int a= scan.nextInt();
		int b =scan.nextInt();
		Calculator nc= new Calculator();
		nc.addMethod(a, b);
		nc.subM(a, b);
		nc.game();
		nc.split1();
		scan.close();
		
	}

}
