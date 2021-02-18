package oct2;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

          String s= "I love Java, and Java is hard, but I need to learn Java so study hard";
          int l= s.length();
          String part1[]=  s.split("");
		//System.out.println(Arrays.toString(part1));
		
		System.out.println("Length of the STring is "+ l);
		//System.out.println(s.replaceAll(" ",""));
       s.replaceAll(" ","");
       
		String part2[]=s.replaceAll(" ","").split("");
		System.out.println("Arrayis" +Arrays.toString(part2));
		
		System.out.println("Length of the Array without Spaces "+ part2.length);
		
		Arrays.sort(part2);
		
		System.out.println(Arrays.toString(part2));
		System.out.println();
		int counter = 0;
		
		for(String w: part2) {
			
			
			System.out.print(w);
			
			
		}

		int ind= Arrays.binarySearch(part2,"y");
		
		System.out.println();
		System.out.println("*"+ind);
		
		
		   String part3[]=  s.split(" ");
		   
			System.out.println(Arrays.toString(part3));

	}

}
