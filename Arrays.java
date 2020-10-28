package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for elements of the list array");
		int el=scan.nextInt();
		List <Integer> list = new ArrayList<>();
		
		for(int i=0; i<el;i++) {
			System.out.println("Enter Elements for the Array");
			list.add(scan.nextInt());
			
		}
		System.out.println("Your Array list is: "+ list);
		

	}

}
