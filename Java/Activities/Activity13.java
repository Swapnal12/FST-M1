package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list =new ArrayList<Integer>();
		
		Random indexgen= new Random();
		
		System.out.println("Enter integers :");
		System.out.println("non-integer to terminate :");
		
		while(sc.hasNextInt())
		{
			list.add(sc.nextInt());
		}
		
		Integer nums[]=list.toArray(new Integer[0]);
		int index=indexgen.nextInt(nums.length);
		
		System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
 
        sc.close();

	}

}
