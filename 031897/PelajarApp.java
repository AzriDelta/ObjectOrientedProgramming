package makmal;

import java.util.*;

public class PelajarApp
{
    public static void main(String [] args)
    {
        Pelajar[] senarai=new Pelajar[10];
        
        Scanner sc=new Scanner(System.in);
        
        String nameIn, programIn;
        int ageIn;
        double pointerIn;
        
        for(int i=0;i<3;i++)
        {
            System.out.println("Name: ");
            nameIn=sc.next();
            System.out.println("Program: ");
            programIn=sc.next();
            System.out.println("Umur: ");
            ageIn=sc.nextInt();
            System.out.println("Pointer: ");
            pointerIn=sc.nextDouble();
            
            senarai[i]=new Pelajar(nameIn, programIn, ageIn, pointerIn);
            
            System.out.println();
            
        }
        
        System.out.print("Senarai pelajar: ");
        
        for(int i=0;i<3;i++)
        {
            System.out.println("Pelajar: "+(i+1));
            System.out.println(senarai[i].getName()+" daripada program "+senarai[i].getProgram()+
                    " dan berumur "+senarai[i].getAge());
            System.out.println("Pointer yang diperolehi ialah: "+senarai[i].getPointer());
            System.out.println();
        }
    }
}