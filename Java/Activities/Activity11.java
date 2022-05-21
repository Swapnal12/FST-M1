package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer ,String>  hashmap =new HashMap<Integer ,String>();
		hashmap.put(1, "Red");
		hashmap.put(2, "Green");
		hashmap.put(3, "Blue");
		hashmap.put(4, "White");
		hashmap.put(5, "Black");
		
		System.out.println("Original HashMap :"+ hashmap);
		
		hashmap.remove(4);
		
		System.out.println("After removing While :"+hashmap) ;
		
		if(hashmap.containsValue("Green"))
			{
					System.out.println("Green exists");
			}
		else
		{
			System.out.println("Green doesn exist");
		}

		System.out.println("Size of the map is :" +hashmap.size());
	}

}
