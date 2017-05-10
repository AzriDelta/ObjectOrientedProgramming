package makmal;

public class StuApp
{
    public static void main(String [] args)
    {
        Student s1=new Student("Cuki Cuki");
        Student s2=new Student("Bad");
        
        s1.setAge(19);
        s1. setProgram("DTMM");
        s1.setPointer(3.56);
        s1.printStudent();
        
        s2.setAge(19);
        s2. setProgram("DTMM");
        s2.setPointer(3.56);
        s2.printStudent();
    }
            
}