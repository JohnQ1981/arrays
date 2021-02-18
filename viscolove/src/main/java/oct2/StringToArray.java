package oct2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		String s="I like Java but Java needs to study hard to learn so study hard";
		String words[]= s.split(" ");
		System.out.println(Arrays.toString(words));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s2 = scan.nextLine();
		
		String st[] = s2.split("");
		
		
		Arrays.sort(st);
		
		System.out.println(Arrays.toString(st));
		int counter =0;
		  for(int i=1;i<st.length;i++) {
			  if(st[i-1].equals(st[i])) {
				  counter++;
				  
			  }else {
				  System.out.println("the Number of "+ st[i-1]+" is "+ (counter+1));
				  counter=0;
			  }
			  if(i==st.length-1) {
				  System.out.println("The number of "+ st[i]+ " is "+(counter+1) );
			  }
		  }
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter int for array elements");
		int a= scan.nextInt();
		//int b = scan.nextInt();
		
		int arr[]= new int[a];
		int g= 0;
		for(int k=0;k<a;k++) {
			
			
				System.out.println("now enter array into inner elements");
				g= scan.nextInt();
				arr[k]=g;
				
				
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println("Now let so two dimen, \n enter two ints");
			int b=scan.nextInt();
			int c=scan.nextInt();
			int arr2[][]=new int[b][c];
			   for(int i=0;i<b;i++) {
				   System.out.println("now enter elements for 2d Arrays");
				   for(int j=0;j<c;j++) {
					   
					   arr2[i][j]=scan.nextInt();
				   }
			   }
			
			LinkedList<String> myLl2=new LinkedList<String>();
			
			   System.out.println(Arrays.deepToString(arr2));
			   System.out.println("Now lets linked list\n enter how many elemtns you want in the linked list");
			   
			   int sizeOfLinkedList=scan.nextInt();
			   
			   for(int t=0;t<sizeOfLinkedList;t++) {
				   System.out.println("now enter elements for the linked list");
				   myLl2.add(scan.next());
			   }
			   System.out.println("Your Linked lis is:==> "+ myLl2);
			   
			   
		}
	
	
	
	
	
		
	}


