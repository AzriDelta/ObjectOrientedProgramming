//Muhammad Azri bin Zainuddin 031897 DTMM 4

package A031897;

import java.util.*;

public class MealCard
{
    int point, point1;
    private Student student;
    
    Scanner sc = new Scanner(System.in);
    

    public MealCard(Student student)
    {
        this(student, 100);
    }
    
    public MealCard(Student student, int point)
    {
        this.student=student;
        this.point=point;
    }
    
    public void buyPoint()
    {
         System.out.println("--------BELI POIN----------");
         System.out.println("Nama pelajar: "+student.getName());
         System.out.println("Bilangan poin yang tinggal: "+getPoint());
         System.out.println("");
         System.out.print("Bilangan poin yang hendak ditambah: ");
         point1=sc.nextInt();
         point=point+point1;
         System.out.println("");
         System.out.println("Nama pelajar: "+student.getName());
         System.out.print("Bilangan poin yang baru ditambah: "+getPoint());
         System.out.println("");
    }
    
    public void buyFood()
    {
        
        System.out.println("--------BELI MAKANAN----------");
        System.out.println("Nama pelajar: "+student.getName());
        System.out.println("Bilangan poin yang tinggal: "+getPoint());
        System.out.println("");
        System.out.print("Bilangan poin yang ditolak (makanan yang dibeli): ");
        point1=sc.nextInt();
        point=point-point1;
        
        if(getPoint()>=0)
        {
            System.out.println("");
            System.out.print("Bilangan poin yang tinggal: "+getPoint());
            System.out.println("");
        }
        
        else
        {
            point=point+point1;
            System.out.println("Maaf, bilangan poin sudah tidak mencukupi.");
        }
    }
    
    public int getPoint()
    {
        return point;
    }
}