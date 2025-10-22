/*
Q3. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.
*/
import java.util.*;
public class maxApp{
	public static void main(String x[])
	{
		FindMax fm = new FindMax();
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		fm.setArray(a);
		System.out.println(fm.getMax());
	}
}

class FindMax{
	int []numbers;
	void setArray(int ...a)//variablr arguments(...)
	{
		numbers = a;
	}
	
	int getMax(){
		//max find logic 
		int max = numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		return max;
	}
}