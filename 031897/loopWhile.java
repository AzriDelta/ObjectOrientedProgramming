import java.util.*;

class loopWhile
{
	public static void main(String [] args)
	{
		int i=0;
		//int a;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nilai i: ");
		i=sc.nextInt();
		
		while(i<=100)
		{
			
			sum+=i;
			
			i++;
		}
		
		System.out.println("Sum of number: "+sum);
		
	}
	
}