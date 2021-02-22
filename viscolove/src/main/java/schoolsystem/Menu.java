package schoolsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Menu {

	static String st_id;

	public void createStId() {
		Random ran = new Random();
		int r = ran.nextInt(500);
		Date ddate = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

		System.out.println(sdf.format(ddate));
		st_id = r + sdf.format(ddate);
		System.out.println(st_id);

	}

	public void stmenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your First and Last Name");
		String sname = scan.nextLine().toUpperCase();
		System.out.println(sname +" Your ID: "+ st_id+ " Welcome to BU, select your Courses from below:");
		System.out.println("1: 101: 'Math'  Cost: $200");
		System.out.println("2: 102: 'English'  Cost: $200");
		System.out.println("3: 103: 'Science'  Cost: $150");
		System.out.println("4: 104: 'Social Studies'  Cost :150");
		HashMap<Integer, String> classes = new HashMap<>();
		Iterator<Integer> itr = classes.keySet().iterator();
		classes.put(101, "Math");
		classes.put(102, "English");
		classes.put(103, "Science");
		classes.put(104, "Social Studies");
		HashMap<Integer, String> stclasses = new HashMap<>();
		HashMap<Integer, Double> sttuition = new HashMap<>();

		String yn;
		int s = 0;
		switch (s = scan.nextInt()) {
		case 1:
			stclasses.put(101, "Math");
			sttuition.put(101, 200.00);
			System.out.println("You added " + stclasses + "Total Cost So far: $" + sttuition.get(101));
			System.out.println("Do you want to select more Classes below\n? 'Y'fro Yes or 'N' for No");
			yn = scan.nextLine().toUpperCase().trim();
			if (!(yn.equals("Y") || yn.equals("N"))) {
				System.out.println("Try only 'Y' or 'N'");
				yn = scan.nextLine().toUpperCase().trim();
			} else if (yn.equals("Y")) {
				
				System.out.println("Hold on....");

			}

		}

	}

}
