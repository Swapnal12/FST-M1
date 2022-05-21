package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<String>();
		hs.add("M");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		hs.add("M");
		hs.add("X");
		
		System.out.println("Original HashSet :" +hs);
		
		System.out.println("Size of HashSet :" +hs.size());
		
		System.out.println("Removing  A from HashSet :" +hs.remove("A"));
		
		if (hs.remove("Z"))
		{
			System.out.println("Z removed from set");
		}
		else
		{
			System.out.println(" Z is not there in set");
		}
		
		System.out.println("Checking if M  is present :"+hs.contains("M"));
		
		System.out.println("Updated HashSet :" +hs);

	}

}
