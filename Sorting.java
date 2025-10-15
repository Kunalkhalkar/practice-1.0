/*
Q4. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array
*/
import java.util.*;
public class Sorting{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int []a = new int[5];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		Sort s = new Sort();
		s.setArray(a);
		int sArray[] = s.getSortArray();
		System.out.println(Arrays.toString(sArray));
	}
}
class Sort{
	private int sort[];
	void setArray(int[] sort){
		this.sort= sort;
	}
	
	int[] getSortArray(){
		int temp;
		for(int i=0; i<sort.length; i++){
			for(int j = i; j<sort.length; j++)
			{
				if(sort[j]< sort[i]){
					temp = sort[j];
					sort[j]= sort[i];
					sort[i] =temp;
				}
			}
		}
		return sort;
	}
}