package projek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class patient
{
    
    String name;
    String age;
    String sex;
    String wardNo;
    String bedNo;
    String illness;
    String date;

    public patient(String name1, String age1, String sex1, String wardNo1, String bedNo1, String illness1, String date1)
    {
        this.name=name1;
        this.sex=sex1;
        this.age=age1;
        this.wardNo=wardNo1;
        this.bedNo=bedNo1;
        this.illness=illness1;
        this.date=date1; 
        
         try 
            {


                Class.forName("com.mysql.jdbc.Driver");//.newInstance();
                Connection con = (Connection) DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/project", "root", "rootroot");

                PreparedStatement psmnt = (PreparedStatement)con.prepareStatement
                ("insert into patient (name,sex,age,wardNo,bedNo,illness,date) values(?,?,?,?,?,?,?)");

                psmnt.setString(1, name);
                psmnt.setString(2, sex);
                psmnt.setString(3, age);
                psmnt.setString(4, wardNo);
                psmnt.setString(5, bedNo);
                psmnt.setString(6, illness);
                psmnt.setString(7, date);
                
                
                int s = psmnt.executeUpdate();
                
                try
                {
                    if(s>0)
                    {
                        JOptionPane.showMessageDialog(null, "Adding record");
                    }
                    
                    else
                    {
                         JOptionPane.showMessageDialog(null, "Adding records");
                    }
                    
                    
                    psmnt.close();
                    con.close();
                    
                }
                
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                 
            }
            
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.toString());
            }
    }
    
    
        
        
}
       /* public void setName(String name1)
        {
            name=name1;
        }
        
        public void setAge(String age1)
        {
            age=age1;
        }
        
        public void setSex(String sex1)
        {
            sex=sex1;
        }
        
        public void setWard(String wardNo1)
        {
            wardNo=wardNo1;
        }
        
        public void setBed(String bedNo1)
        {
            bedNo=bedNo1;
        }
        
        public void setIllness(String illness1)
        {
            illness=illness1;
        }
        
        public void setDate(String date1)
        {
            date=date1;
        }
        
        
        
        public String getName()
        {
            return name;
        }
        
        public String getAge()
        {
            return age;
        }
        
        public String getSex()
        {
            return sex;
        }
        
        public String getWard()
        {
            return wardNo;
        } */

    
