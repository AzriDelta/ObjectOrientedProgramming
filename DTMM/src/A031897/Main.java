//Muhammad Azri bin Zainuddin 031897 DTMM 4

package A031897;

import java.util.*;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int point,i; 
        int choice=0;
        String name;
        
        Student student = new Student();
        student.setName();
        System.out.print("Masukkan bilangan poin awal: ");
        point=sc.nextInt();
        MealCard mealCard = new MealCard(student, point);
        
        System.out.println("");
        System.out.println("Nama pelajar: "+student.getName());
        System.out.println("Bilangan poin: "+mealCard.getPoint());
        System.out.println("");
               
        System.out.println("-----SISTEM PEMBELIAN---- ");
        
        while(choice!=3)
        {
            System.out.println("");
            System.out.println("-----MENU-------");
            System.out.println("[1] Beli makanan");
            System.out.println("[2] Beli mata");
            System.out.println("[3] Keluar");
            System.out.print("Masukkan pilihan anda: ");
            choice=sc.nextInt();
          
            System.out.println("");
            switch(choice)
            {
                case 1:
                    
                     mealCard.buyFood();
                    break;
                
                 case 2:
                   
                    mealCard.buyPoint();
                    break; 
                    
                default:
                    break;
            }
            
           
        }
        
       
        System.out.println("-----SISTEM PEMBELIAN TAMAT---- ");
        /* System.out.print("Berapa orang pelajar yang ingin dicipta: ");
        count=sc.nextInt();
        
        
        for (int i=0; i<count;i++)
        {
            Student[] student = new Student[i];
            MealCard[] mealcard = new MealCard[i];
            
            System.out.println("Nama pelajar: ");
            name=sc.next();
            student[i] = new Student(name);
            mealcard[i]= new MealCard(name);
          
        } */
    }
}