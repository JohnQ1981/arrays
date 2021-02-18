package oct2;

import java.util.Scanner;

public class PalidromOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String and lets get it reverse \n and \n check if it palidrom");
		String c="";
		String pl=scan.next().toUpperCase().trim();
		 
		for(int i =pl.length()-1;i>=0;i--) {
			c=c+pl.charAt(i);
		}
		
		System.out.println("Your string in Reverse===> "+ c);
		System.out.println("Enter one more String lets check with method");
		String fM=scan.next().toLowerCase().trim();
		checkPl(fM);
	}

	public static void checkPl(String s) {
		String b="";
		for(int i=s.length()-1;i>=0;i--) {
			b=b+s.charAt(i);
		}
		System.out.println("This is Reverse2==>From Method===>"+ b);
		
		if(s.equals(b)) {
			System.out.println(b+ "<=== is Palindrom");			
		}else {
			System.out.println(b+ " <==== is not Palidrom");
		}
		
	}
	
	
}
