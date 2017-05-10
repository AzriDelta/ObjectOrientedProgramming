package projek;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class mainGUIv3 extends JApplet implements ActionListener
{
    //create component
    
    String [] gender1 = {"Male", "Female"};
    
    //private JLabel tajuk;
    
    private JLabel name1 = new JLabel("Name:");
    private JTextField name2 = new JTextField(30);
    
    private JLabel sex1 = new JLabel("Sex");
    private JComboBox sex2 = new JComboBox(gender1);
    
    private JLabel age1 = new JLabel("Age:");
    private JTextField age2 = new JTextField(2);;
    
    private JLabel wardNo1 = new JLabel("Ward No.:");
    private JTextField wardNo2 = new JTextField(6);;
    
    private JLabel bedNo1 = new JLabel("Bed No.:");
    private JTextField bedNo2 = new JTextField(6);;
    
    private JLabel illness1 = new JLabel("Illness:");
    private JTextField illness2 = new JTextField(45);;
    
    private JLabel date1 = new JLabel("Date  of Admission:");
    private JTextField date2= new JTextField(30);;
    
    private JButton submit = new JButton("Submit");
    private JButton cancel = new JButton("Cancel");
    
       
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
        panel.add(wardNo1);
        panel.add(wardNo2);
        panel.add(bedNo1);
        panel.add(bedNo2);
        panel.add(date1);
        panel.add(date2);
        panel.add(illness1);
        panel.add(illness2);
        panel.add(submit);
        submit.addActionListener(this);
        panel.add(cancel);
        cancel.addActionListener(this);
        
        
        pane.add(panel, BorderLayout.WEST);
        pane.add(display, BorderLayout.CENTER);

        
       // panel.add(borang, BorderLayout.CENTER);
        
        
         
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        Object obj = e.getSource();
        
        if(obj == submit)
        {
            //customer ID letak loop mungkin atau takpayah hantar custID ke database
            
            String name = name2.getText();
            String sex = (String) sex2.getSelectedItem();
            String age = age2.getText();
            String wardNo = wardNo2.getText();
            String bedNo = bedNo2.getText();
            String illness = illness2.getText();
            String date = date2.getText();
            
            patient patient = new patient(name,sex,age,wardNo,bedNo,illness,date);
            
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "nothing");
        }
    }
    
}