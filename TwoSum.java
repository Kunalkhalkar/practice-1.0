/*
5. Two-Sum in Sorted Array (two pointers)

Problem:
Given a sorted array arr[] and a target T, find whether there exists a pair i < j such that arr[i] + arr[j] = T. Return their indices or a boolean.
*/
import java.util.*;
public class TwoSum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array elments");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = a.length- 1;
		int sum = 0;
		System.out.println("Enter tareget value");
		int t= sc.nextInt();
		
		while(left < right && right <a.length){
			sum = a[left] + a[right];
			if(sum == t){
				System.out.printf("[%d, %d]",left, right);
				right--;
			}
			else if(sum < t){
				left++;
			}
			else if(sum > t){
				right--;
			}
		}
	}
}