import java.util.*;

class loopDo
{
	public static void main(String [] args)
	{
		int i=0;
		//int a;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan nilai i: ");
		i=sc.nextInt();
		
		do 
		{
			
			sum+=i;
			
			i++;
		} while(i<=100);
		
		System.out.println("Sum of number: "+sum);
		
	}
	
}