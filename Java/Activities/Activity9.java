package Activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList=new ArrayList<String>();
		
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Mango");
		
		myList.add(3, "Grapes");
		myList.add(1, "Papaya");
		
		System.out.println("Print all elements");
		
		for (String list : myList) {
			System.out.println(list);
		}
		
		System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Papaya");
        
        System.out.println("New Size of ArrayList: " + myList.size());

	}

}
