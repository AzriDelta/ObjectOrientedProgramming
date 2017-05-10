//Muhammad Azri bin Zainuddin 031897 DTMM 4

package A031897;

import java.util.*;

public class Student
{
    private String name;
    Scanner sc = new Scanner(System.in);
    
    public void setName() 
    {
        
        System.out.print("Masukkan nama pelajar: ");
        name=sc.next();
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }
}