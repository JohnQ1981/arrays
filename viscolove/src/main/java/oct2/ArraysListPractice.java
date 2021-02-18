package oct2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysListPractice {

	public static void main(String[] args) {


		double ar1[] = {2,6,5,4,8,955,4,7,};
		
		Arrays.sort(ar1);
		System.out.println("Sorted Array "+ Arrays.toString(ar1));//[2.0, 4.0, 4.0, 5.0, 6.0, 7.0, 8.0, 955.0]
		
		double s= 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Double to find if Arrays has it :");
		
		double item = scan.nextDouble();
		
		for(int i =0; i<ar1.length;i++) {

			s = s +ar1[i];
			
			if(item==ar1[i]) {
				System.out.println("Yes it is in the Array");
			} 
			
		}
		
		double av= (s/ar1.length);
		
		System.out.println("Total Value of elements of the Arrays is: "+ s+" And Average: "+ av);
		
		System.out.println("Enter Double to find if Arrays has it and i will give you the index :");
		
		double item2 = scan.nextDouble();
		
		System.out.println("index of the element you entered in the arrays is: " + Arrays.binarySearch(ar1, item2));
		
		
		int ma[][] = new int[10][5];
		for(int i =0; i<10;i++) {
			for(int j =0; j<5;j++) {
				System.out.print(ma[i][j]+"*");
			}
			System.out.println();
		}
		
		int ma2[][] = new int[10][2];
		for(int i =0; i<10;i++) {
			
			for(int j =0; j<2;j++) {
				ma2[i][j] = 2;
				//System.out.print(ma2[i][i]+"*");
			}
			
		}
		
		System.out.println("Enter number of elements for the Array");
		int g = scan.nextInt();
		
		
		int ma3[] = new int [g];
		for(int k =0; k<g;k++) {
			
			ma3[k]= k;
			
		}
		System.out.println(Arrays.toString(ma3));
		
		List<Integer> lfromma3= new ArrayList<Integer>();
		for(int u =0 ;u<ma3.length;u++) {
			
			lfromma3.add(ma3[u]);
			
			
			
		}
		
		System.out.println("List is " +lfromma3);
		
		lfromma3.add(45);
		System.out.println();
		
		System.out.println(lfromma3.size());
		System.out.println("New List is " +lfromma3);
		System.out.println();
		System.out.println();
		System.out.println(Arrays.deepToString(ma));
		System.out.println();
		System.out.println(Arrays.deepToString(ma2));
		
		
		
		
		

	}

}
