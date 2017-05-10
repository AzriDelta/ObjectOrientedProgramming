import java.util.*;

public class createAnimal
{
	public static void main (String [] args)
	{
		animal elephant = new animal(); //syntax to create object animal
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Masukkan jenis haiwan: ");
		String type=sc.next(); //cipta new variable dan masukkan nilai

		System.out.print("Masukkan jantina haiwan: ");
		String sex=sc.next();

		System.out.print("Masukkan umur haiwan: ");
		int age=sc.nextInt();
		
		elephant.setType(type);
		elephant.setSex(sex);
		elephant.setAge(age);

		System.out.print("Elephant is a "+ elephant.getType() + ". It is a "+ elephant.getSex() + " and its age is "+ elephant.getAge()+" years old.");
	}
}