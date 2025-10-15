// rotate array clockwise
import java.util.*;
public class rotate{
	public static void main(String x[]){
		int a[] = new int[]{1,2,3,4,5};
		int k=1, temp;
		for(int i=0, j=a.length -1; i<a.length / 2; i++,j--)
		{
			temp = a[i];
			a[i]= a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
		for(int i=0,j=k-1; i<(k/2); i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println(Arrays.toString(a));
		
		
		for(int i=k, j=a.length-1; i<=(a.length)/2; i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
		}
		System.out.println(Arrays.toString(a));
	}
}