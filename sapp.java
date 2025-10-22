/*15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/
public class sapp
{
	public static void main(String x[]){
		Swapper sp = new Swapper();
		sp.swap(10, 20);
	}
}

class Swapper{
	void swap(int a, int b)
	{
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a+" "+b);
	}
}