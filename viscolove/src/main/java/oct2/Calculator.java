package oct2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Calculator {

	public void addMethod(int a, int b) {
		
		int c= a+b;
		System.out.println(c+" add method");
				
	}
	
	public void subM(int a, int b) {
		int c = a-b;
		System.out.println(c+" sub method");
		
	}
	
	public void game() {
		Scanner scan = new Scanner(System.in);
		Random ran= new Random();
		int random= ran.nextInt(10);
		int flag=0;
		int userInput;
		do {
			
			System.out.println("Guess the Integer Generated by Random Method ");
			 userInput= scan.nextInt();
			flag++;
			
		}while(random!=userInput);
		
		System.out.println("Congratulations! The Random int is: "+ random+" and you Guessed");
		System.out.println("Guessed in "+ flag+ " times");
		
	}
	
	public void split1() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter a string and lets get some details about it");
		String str= scan.nextLine().toUpperCase();
		String[] spl=str.split("");
		System.out.println(Arrays.toString(spl)+" <=== this is Array");
		List<String> split= new ArrayList<String>();
		List<String> splitreverse= new ArrayList<String>();
		for(int i=0;i<spl.length;i++) {
			split.add(spl[i]);
			
		}
		System.out.println(split +" <==== This is List and size is "+ split.size());
		for(int j = split.size()-1;j>=0;j--) {
			
			splitreverse.add(split.get(j));
						
		}
		System.out.println("The reverse of the string is: "+ splitreverse+"\n and the size is:==> "+ splitreverse.size());
		System.out.println("Now see if below if it Palidrom or not");
		PalidromOrNot chpl=new PalidromOrNot();
		chpl.checkPl(str);
		
		
		
		
		
		
		
		
	}
	
	
	
}
