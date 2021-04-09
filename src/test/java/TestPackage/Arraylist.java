package TestPackage;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		for(String i:cars) {
			System.out.println(i);
		}
		
			if(cars.contains("Ford")) {

				System.out.println("Best");
			
		}

	}

}



