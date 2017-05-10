import java.util.*;

class testScore
{
	public static void main(String [] args)
	{
		
		int testScore;
		int studentAge;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Masukkan markah ujian: ");
		testScore=sc.nextInt();
		
		
		
		if(testScore>=70)
		{
		
		
			System.out.print("Masukkan umur pelajar: ");
			studentAge=sc.nextInt();
		
			if(studentAge<18)
			{
				System.out.println("You did a great job.");
				System.out.println("Keep up the good work");
				
			}
			
			else
			{
				System.out.println("You did pass.");
			}
			
		}
		
		else
		{
			System.out.println("You did not pass!!");
			System.out.println("Try harder next time");
		
		}
		
		
	}
}