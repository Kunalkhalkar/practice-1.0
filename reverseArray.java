/*5. Reverse an Array In-place

Approach: Two Pointers from both ends
Example: arr = [1,2,3,4,5] → [5,4,3,2,1]
*/
import java.util.*;
public class reverseArray{
	public static void main(String x[])
	{
		System.out.println("Enter array element");
		Scanner sc =new Scanner(System.in);
		int a[] = new int [5];
		for(int i=0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int temp;
		for(int i=0, j=a.length-1; i<=a.length/2; i++,j--){
			temp = a[i];
			a[i]= a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
		
	}
}