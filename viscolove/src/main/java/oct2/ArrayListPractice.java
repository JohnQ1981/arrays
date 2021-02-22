package oct2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice {

	private static final String String = null;

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();

		myList.add("HelloWorld");
		myList.get(0);
		System.out.println(myList);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter int for creation of Array and List");
		int l = scan.nextInt();
		String e;
		System.out.println(myList.size());
		for (int i = 0; i < l; i++) {
			System.out.println("Enter List Elements as string");
			e = scan.nextLine();
			myList.add(e);
		}
		System.out.println(myList + "<====Final List");

		HashSet<String> myHashSet = new HashSet<>();
		myHashSet.addAll(myList);
		System.out.println(myHashSet + "===< Final HashSet");
		HashMap<String, Integer> myMap = new HashMap<>();

		System.out.println("Enter String for map");
		String m = scan.next();
		Random random = new Random();
		int ran = (int) Math.floor(0.5 * random.nextInt());
		System.out.println(random.nextInt());
		myMap.put(m, random.nextInt());
		System.out.println(myMap);

		HashMap<Integer, String> myMap2 = new HashMap<>();
		HashMap<Integer, String> myMap3 = new HashMap<>();
		// int randomint= random.nextInt(100);
		// int randomint2= random.nextInt();
		System.out.println("Enter number of products you want to add");
		int np = scan.nextInt();
		for (int i = 0; i <= np; i++) {
			int randomint = random.nextInt(100);
			int randomint2 = random.nextInt(20);
			System.out.println("now enter Product name");
			String pn = scan.next().toUpperCase().trim();
			myMap2.put(randomint, pn);
			myMap3.put(randomint2, pn + "*");

		}
		System.out.println("Your Products in Map2  are: " + myMap2);
		System.out.println("Your Products in Map3 are===>: " + myMap3);

		LinkedList<String> ll1 = new LinkedList<>();

		System.out.println("Enter how many elements you want in the Linked List");
		int lle = scan.nextInt();

		for (int j = 0; j < lle; j++) {
			ll1.add(scan.next());

		}
		System.out.println(ll1 + "<===Linked List");

		String s = "I like Java but Java needs to study hard to learn so study hard";
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));

	}

}
