/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/
public class papp{
	public static void main(String x[])
	{
		PrimeChecker pc = new PrimeChecker();
		System.out.println(pc.isPrime(5));
	}
}

class PrimeChecker{
	boolean isPrime(int num){
		for(int i=2; i<(num/2); i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
