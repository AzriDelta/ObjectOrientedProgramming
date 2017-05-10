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

public class mainGUI extends JApplet implements ActionListener
{
    //create component
    
    private JLabel tajuk;
    
    private JLabel name1;
    private JTextField name2;
    
    private JLabel sex1;
    private JTextField sex2;
    
    private JLabel age1;
    private JTextField age2;
    
    private JLabel wardNo1;
    private JTextField wardNo2;
    
    private JLabel bedNo1;
    private JTextField bedNo2;
    
    private JLabel illness1;
    private JTextArea illness2;
    
    private JLabel date1;
    private JTextField date2;
    
    private JButton submit;
    
    private JPanel display;
    private JPanel display1;
    
    
    @Override
    public void init()
    {
        //initialize component
        
        submit = new JButton("Add");
        
        setSize(500, 300);
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        
        display = new JPanel();
        display.setBackground(Color.blue);
        display.setLayout(new GridLayout(7, 10));
        //display.setLayout(new FlowLayout());
        
        
        panel.add(submit,BorderLayout.CENTER);
        submit.addActionListener(this);
        
        
        pane.add(panel, BorderLayout.WEST);
        pane.add(display, BorderLayout.CENTER);

        
       // panel.add(borang, BorderLayout.CENTER);
        
        
         
    }
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int qm = JOptionPane.QUESTION_MESSAGE;
        int im = JOptionPane.INFORMATION_MESSAGE;
        patient patient=new patient();

        String name = JOptionPane.showInputDialog (null, "Enter patient's name:", "Name", qm);
        patient.setName(name);
        //System.out.println("Nama pesakit: "+patient.getName());
       
              
        String sex = JOptionPane.showInputDialog (null, "Enter patient's sex:", "Sex", qm);
        patient.setSex(sex);
        //System.out.println("Nama pesakit: "+patient.getSex());
        
        String age = JOptionPane.showInputDialog (null, "Enter patient's age:", "Age No.", qm);
        patient.setAge(age);
        
        String wardNo = JOptionPane.showInputDialog (null, "Enter patient's ward number:", "Ward No.", qm);
        patient.setWard(wardNo);
        
        String bedNo = JOptionPane.showInputDialog (null, "Enter patient's bed number:", "Bed No.", qm);
        patient.setBed(bedNo);
        
        String illness = JOptionPane.showInputDialog (null, "Enter patient's illness:", "Nature of Illness", qm);
        patient.setIllness(illness);
        
        String date = JOptionPane.showInputDialog (null, "Enter patient's date of admission:", "Date of Admission", qm);
        patient.setDate(date);

        
        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Arial", 0, 10));
        display.add(nameLabel);
        
        JLabel sexLabel = new JLabel(sex);
        sexLabel.setFont(new Font("Arial", 0, 10));
        display.add(sexLabel);
        
        JLabel ageLabel = new JLabel(age);
        ageLabel.setFont(new Font("Arial", 0, 10));
        display.add(ageLabel);
        
        JLabel wardLabel = new JLabel(wardNo);
        wardLabel.setFont(new Font("Arial", 0, 10));
        display.add(wardLabel);
        
        JLabel bedLabel = new JLabel(bedNo);
        bedLabel.setFont(new Font("Arial", 0, 10));
        display.add(bedLabel);
        
        JLabel illnessLabel = new JLabel(illness);
        illnessLabel.setFont(new Font("Arial", 0, 10));
        display.add(illnessLabel);
        
        JLabel dateLabel = new JLabel(date);
        dateLabel.setFont(new Font("Arial", 0, 10));
        display.add(dateLabel);
        
        display.revalidate();

        
        
    }
    
    
}