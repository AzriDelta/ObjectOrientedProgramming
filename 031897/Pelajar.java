package makmal;

public class Pelajar
{
    private String name, program;
    private int age;
    private double pointer;
    
    public Pelajar(String nameIn, String programIn, int ageIn, double pointerIn)
    {
        name = nameIn;
        program=programIn;
        age=ageIn;
        pointer=pointerIn;
    }
    
    public void setProgram(String programIn)
    {
        program=programIn;
    }
    
    public void setAge(int ageIn)
    {
        age=ageIn;
    }
    
     public void setPointer(int pointerIn)
    {
        pointer=pointerIn;
    }
     
     public String getName()
     {
         return name;
     }
     
     public String getProgram()
     {
         return program;
     }
     
     public int getAge()
     {
         return age;
     }
     
     public double getPointer()
     {
         return pointer;
     }
}