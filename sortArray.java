/*4. Merge Two Sorted Arrays (In-place)
Approach: Two Pointers from end
Example: arr1 = [1,3,5,0,0,0], arr2 = [2,4,6] → [1,2,3,4,5,6]
*/
import java.util.*;
public class sortArray{
	public static void main(String x[]){
		int []arr1 = new int[]{1, 2, 3, 0, 0, 0};
		int []arr2 = new int[]{2, 3, 6};
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
			System.out.println("merged array");
		
		int left = arr2.length-1;//second array last index
		int right = (arr1.length-arr2.length-1);// last number avalable in array 1 i.e 5(6 - 3 - 1 = 2)
		int ind = arr1.length-1; // array 1 last index
		for(int i=arr2.length; i>=0; i--)
		{
			if(arr2[left] > arr1[right]){
				arr1[ind] =arr2[left];
				--left;
				--ind;
			}
			else{
				arr1[ind] = arr1[right];
				--ind;
				--right;
			}
		}
		
			System.out.println(Arrays.toString(arr1));
		
	}
}