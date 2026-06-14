//wajp to determine whether the given number is a prime number or not

class PrimeNumber{
	public static void main(String []args){
		int num=1234567890;
		boolean isPrime = true;
		if(num<=1){
			isPrime= false;
			break;
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
				}
			}
		}
		
		if(isPrime)
		{
			System.out.println(num + " is a prime number");
			
		}
		else
		{
			System.out.println(num + " is not `a prime number");
		}
	}
	
}