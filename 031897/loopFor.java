import java.util.*;

class loopFor
{
	public static void main(String [] args)
	{
		int i=0;
		int a;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nilai i: ");
		a=sc.nextInt();
		
		for(i=a;i<=100;i++)
		{
			
			sum+=i;
		}
		
		System.out.println("Sum of number: "+sum);
		
	}
	
}