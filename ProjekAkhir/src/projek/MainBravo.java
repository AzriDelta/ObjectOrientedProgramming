/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bravo_01;

//import java.util.Scanner;
//army
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author lenovo
 */  


public class MainBravo extends JApplet implements ActionListener { //edited army
    /*
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        
        String name="";
        String sex="";
        String age="";
        String wardNo="";
        String bedNo="";
        String NOI="";
        String DOA="";
       
        
        
        RADIO P1;
        P1 = new RADIO(name,sex,age,wardNo,bedNo,NOI,DOA);
        
        
        System.out.println("Masukkan nama pesakit : ");
        name = sc.next();
        System.out.println("Masukkan jantina : ");
        sex = sc.next();
        System.out.println("Masukkan umur  : ");
        age = sc.next();
        System.out.println("Masukkan no wad  : ");
        wardNo = sc.next();
        System.out.println("Masukkan no katil  : ");
        bedNo = sc.next();
        System.out.println("Masukkan NOI : ");
        NOI = sc.next();
        System.out.println("Masukkan DOA  : ");
        DOA = sc.next();
          
          
        P1.patient(name,sex,age,wardNo,bedNo,NOI,DOA);
          
    }
    */
   String [] gender1 = {"Male", "Female"};
    
    //private JLabel tajuk;
    
    private final JLabel name1 = new JLabel("Name:");
    private final JTextField name2 = new JTextField(30);
    
    private final JLabel sex1 = new JLabel("Sex");
    private final JComboBox sex2 = new JComboBox(gender1);
    
    private final JLabel age1 = new JLabel("Age:");
    private final JTextField age2 = new JTextField(2);;
    
    private final JLabel wadNo1 = new JLabel("Ward No.:");
    private final JTextField wadNo2 = new JTextField(6);;
    
    private final JLabel bedNo1 = new JLabel("Bed No.:");
    private final JTextField bedNo2 = new JTextField(6);;
    
    private final JLabel NOI1 = new JLabel("Illness:");
    private final JTextField NOI2 = new JTextField(45);;
    
    private final JLabel DOA1 = new JLabel("Date  of Admission:");
    private final JTextField DOA2= new JTextField(30);;
    
    private final JButton submit = new JButton("Submit");
    private final JButton cancel = new JButton("Cancel");
    
       
    @Override
    public void init()
    {
        //initialize component
        
        
        setSize(1200, 300);
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(new GridLayout(8,2));
        panel.setSize(150,300);
        
        JPanel display = new JPanel();
        display.setBackground(Color.blue);
        display.setLayout(new GridLayout(7, 10));
        display.setSize(350,300);
        
        
        panel.add(name1);
        panel.add(name2);
        panel.add(sex1);
        panel.add(sex2);
        panel.add(age1);
        panel.add(age2);
        panel.add(wadNo1);
        panel.add(wadNo2);
        panel.add(bedNo1);
        panel.add(bedNo2);
        panel.add(DOA1);
        panel.add(DOA2);
        panel.add(NOI1);
        panel.add(NOI2);
        panel.add(submit);
        submit.addActionListener(this);
        panel.add(cancel);
        cancel.addActionListener(this);
        
        
        pane.add(panel, BorderLayout.NORTH);
        pane.add(display, BorderLayout.CENTER);
        
        

        
       // panel.add(borang, BorderLayout.CENTER);
        
        
         
    }

    @Override
    public void actionPerformed(ActionEvent evt) 
    {
        Object obj = evt.getSource();
        
        if(obj == submit)
        {
            //customer ID letak loop mungkin atau takpayah hantar custID ke database
            
            String name = name2.getText();
            String sex = (String) sex2.getSelectedItem();
            String age = age2.getText();
            String wardNo = wadNo2.getText();
            String bedNo = bedNo2.getText();
            String NOI = NOI2.getText();
            String DOA = DOA2.getText();
            
            
            
            
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bravo", "root", "rootroot");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * from bravo.patient_bravo");

                PreparedStatement preparedStatement = connection.prepareStatement("insert into patient_bravo (name,sex,age,wardNo,bedNo,NOI,DOA)  values (?,?,?,?,?,?,?)"); //(name,sex,age,wadNo,bedNo,NOI,DOA) 
                
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, sex);
                preparedStatement.setString(3, age);
                preparedStatement.setString(4, wardNo);
                preparedStatement.setString(5, bedNo);
                preparedStatement.setString(6, NOI);
                preparedStatement.setString(7, DOA);

                //preparedStatement.executeUpdate();
/*
            } catch (Exception e) {
                System.out.println("Couldnt get connection");
            }
                */


                /*
                Class.forName("com.mysql.jdbc.Driver");//.newInstance();
                Connection con = (Connection) DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/project_final_java", "root", "rootroot");

                PreparedStatement psmnt = (PreparedStatement)con.prepareStatement
                ("insert into patient (patientID,name,sex,age) values(?,?,?,?)");

                //psmnt.setInt(1, patientID);
                psmnt.setString(2, name);
                psmnt.setString(3, sex);
                psmnt.setString(4, age);
               
                */
                
                int s = preparedStatement.executeUpdate();
                
                try
                {
                    if(s>0)
                    {
                        JOptionPane.showMessageDialog(null, "Adding record");
                        //display.add(new JLabel(name));
                        
                    }
                    
                    else
                    {
                         JOptionPane.showMessageDialog(null, "Adding records");
                    }
                    
                    
                    preparedStatement.close();
                    connection.close();
                    
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
        
        else
        {
            JOptionPane.showMessageDialog(null, "Exit");
            System.exit(0);
        } 
        
        
    }
    }

    
    
   