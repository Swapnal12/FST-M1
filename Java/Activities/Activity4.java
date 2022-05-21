package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String args[]) {

  int[] data= {9,5,1,4,3};
  ascendingSort(data);	
  System.out.println("Ascending sort in order :");
  System.out.println(Arrays.toString(data));

	}
	
	static void ascendingSort(int array[])
	 {
		 int size=array.length,i;
		 
		 
		 for (i=1;i<size;i++)
		 {
			int temp = array[i];
			int j=i;
			
			while(j>0 && array[j-1]>temp)
			{
				array[j]=array[j-1];
				j=j-1;
				
			}
			
			array[j]=temp;
			
			 
			 
		 }
	 }

}
