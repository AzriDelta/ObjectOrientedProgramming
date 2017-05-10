import java.util.*;

public class createStudent 
{
    public static void main(String [] args)
    {
        Student stud = new Student();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nama pelajar: ");
        String name=sc.next();
        
        System.out.print("Masukkan nombor matriks: ");
        int matriks=sc.nextInt();
        
        System.out.print("Masukkan hobi pelajar: ");
        String hobby=sc.next();
        
        stud.setName(name);
        stud.setMatriks(matriks);
        stud.setHobby(hobby);
        
        System.out.println("Nama pelajar: "+stud.getName());
        System.out.println("Nombor matriks: "+stud.getMatriks());
        System.out.println("Hobi pelajar: "+stud.getHobby());
           
    }
}
