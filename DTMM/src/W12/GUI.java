// Muhammad Azri bin Zainuddin 031897 DTMM4

package W12;

import javax.swing.*;


public class GUI 
{
    
    public static void main(String []args) throws ArithmeticException
    {
        int qm = JOptionPane.QUESTION_MESSAGE;
        int im = JOptionPane.INFORMATION_MESSAGE;
        boolean set=true;
        String age="";
        
        String name = JOptionPane.showInputDialog (null, "Enter your name:", "Input", qm);
        System.out.println("Entered: "+name);

        
       do
       {
            try
            {
                age = JOptionPane.showInputDialog (null, "Enter your age:", "Input", qm);
                int i = Integer.parseInt(age);
                set=false;
            }
        
            catch(NumberFormatException nfe)
            {
                age = JOptionPane.showInputDialog (null, age+" is not an integer. Enter an integer", "Input", qm);
                //int i = Integer.parseInt(age);
                
            } 
            
            
            
       }while(set);
            


       System.out.println("Entered: "+age);
       
       String result = "Your details are:\n"+name+"\n"+age;
        
        JOptionPane.showMessageDialog (null, result, "Message", im);
 
        System.out.println("");
        System.out.println("");
        System.out.println("You already input");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
    
}