package Activities;

import java.util.Arrays;

public class Activity2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr= {10,77,10,54,-11,10};
		
		System.out.println("Original array" +Arrays.toString(numArr));
		int searchnum=10;
		int fixednum=30;
		int sum=0;
		
		for (int number : numArr) {
			
			
			
			if(number==searchnum)
			{
				sum = sum +searchnum;
				
			}
			
			
			if(sum>fixednum)
			{
				break;
			}
		}
		
		
		System.out.println("sum is "+sum);
		if(sum==fixednum)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}

}
