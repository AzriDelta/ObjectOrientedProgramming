/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projek;
import java.util.Scanner;

/**
 *
 * @author COMPAQ
 */
public class black {
    
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        
        String name="";
        String sex="";
        String age="";

       
        
        black2 s1;
        s1 = new black2(name,sex,age);
        
        
        System.out.print("Masukkan nama pertama : ");
        name = sc.next();
        System.out.print("Masukkan jantina  : ");
        sex = sc.next();
        System.out.print("Masukkan umur  : ");
        age = sc.next();

          
          
        s1.student1(name,sex,age);
          
    }
    
}
