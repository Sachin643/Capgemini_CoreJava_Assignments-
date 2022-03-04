
public class FIZZBUZZ {
	public static void main(String[] args) {
		
		System.out.println("Program started");
		int n=15;
		if(n%3==0 && n%5==0 )
		{
		System.out.println("FIZZ BUZZ");
		}
		else if (n%5==0)
		{
			System.out.println("BUZZ");
		}
		else if (n%3==0)
		{
			System.out.println("FiZZ");
		}
		System.out.println("program ended");
	}

}
