import java.util.*;

class gredLevel
{
	public static void main(String [] args)
	{
	
	int gred;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Masukkan tahap gred anda: ");
	gred=sc.nextInt();
	
	switch(gred)
	{
		case 1:
			System.out.println("Go to gymnasium");
			break;
			
		case 2:
			System.out.println("Go to auditorium");
			break;
			
		case 3:
			System.out.println("Go to Hall D511");
			break;
			
		default:
			System.out.println("Go to cafe");
	}
	
	}
	
}