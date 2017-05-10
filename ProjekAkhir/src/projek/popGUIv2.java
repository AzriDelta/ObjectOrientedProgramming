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

public class popGUIv2
{
    
    public static void main(String[]args)
    {
        //create component
        int qm = JOptionPane.QUESTION_MESSAGE;
        int im = JOptionPane.INFORMATION_MESSAGE;
        patient patient=new patient();

        String name = JOptionPane.showInputDialog (null, "Masukkan nama pesakit:", "Nama", qm);
        patient.setName(name);
        System.out.println("Nama pesakit: "+patient.getName());

    }
}