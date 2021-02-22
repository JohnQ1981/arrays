package oct2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashSet<String> hashSet = new HashSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<String>();
		List<String> myList = new ArrayList<>();
	
		
		Map<Integer, String> myMap = new HashMap<>();
		Random r= new Random();
		
		System.out.println("Enter Long String and lets see them in Collections");
		String str= scan.nextLine().toUpperCase();
		String[] arr = new String[str.length()];
		String[] arr2= new String[str.length()];
		arr= str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr)+"<==== Array of String");
		System.out.println(hashSet.add(str+ "<====== HashSet"));
		System.out.println(hashSet);
		System.out.println(linkedHashSet.add(str+"<==========Linked HashSet"));
		System.out.println(linkedHashSet);
		System.out.println(treeSet.add(str+"<============= Tree Set"));
		System.out.println(treeSet);
		for(int i =0; i<5; i++) {
			int ran=r.nextInt(100);
			hashSet.add(rndChar());
			linkedHashSet.add(rndChar());
			treeSet.add(rndChar());
			myList.add(rndChar());
			myMap.put(ran, rndChar());
			
		}
		
		System.out.println(hashSet + " Hash set With Random String");
		System.out.println(linkedHashSet+ "Linked Hash Set With Random String");
		System.out.println(treeSet+ "Tree Set With Random String");
		System.out.println(myList+ "List With Random String");
		System.out.println(myMap+ "Map With Random String");
		scan.close();
		
		
		
		
		
		
	}
	
	
	private static String rndChar () {
	    int rnd = (int) (Math.random() * 52); // or use Random or whatever
	    String base = (rnd < 26) ? "A" : "a";
	    return (String) (base + rnd % 26);

	}

}
