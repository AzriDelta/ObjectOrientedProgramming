public class Student
{
    private String name;
    private int matriks;
    private String hobby; 
    
    // input 
    
    public void setName(String newName)
    {
        name=newName;
    }
    
    public void setMatriks(int newMatriks)
    {
        matriks=newMatriks;
    }
    
    public void setHobby(String newHobby)
    {
        hobby=newHobby;
    }
    
    //output return
    
    public String getName()
    {
        return name;
    }
    
    public int getMatriks()
    {
        return matriks;
    }
    
    public String getHobby()
    {
        return hobby;
    }
}

