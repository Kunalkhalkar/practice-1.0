/*
3. Count Subarrays with Sum = K (non-negative array)
Problem:
Given a non-negative integer array arr[] and an integer K, count the number of contiguous subarrays whose sum is exactly K.
*/
import java.util.*;
public class CountSubArray{
	public static void main(String x[])
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array element");
		for(int i = 0; i< a.length; i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k(k is addition of elment in sub array)");
		int k = sc.nextInt(); //3
	
		int l = 0;
		int r =0; 
		int sum =0;
		int count =0;
		while(r < a.length && l<=r){
			// for(int i=0; i<a.length;i++)
			// {
				if(sum < k){
					sum+=a[r];
					r++;
				}
				else if(sum == k)
				{
					count++;
					sum+=a[r];
					r++;
				}
				else if(sum > k && l<=r)
				{
					sum -=a[l];
					l++;
				}
			
		
		}
		if(count== 0){
			System.out.println("No pair foun with the exact addition "+k);
		}
		System.out.println("Number of substring of addition : "+k+" is "+count);
	}
}