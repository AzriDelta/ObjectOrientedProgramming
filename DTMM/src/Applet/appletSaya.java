// Muhammad Azri bin Zainuddin 031897 DTMM4

package Applet;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.applet.Applet;
import java.net.URL;

public class appletSaya extends JApplet
{
    
    private BufferedImage img = null;
    private Color blue;
    
    @Override
    public void init()
    {
        setSize(1162, 695);
        Container pane=getContentPane();
        pane.setBackground(Color.blue);
        pane.setLayout(new FlowLayout());
        
       /* try 
        {
             URL url = new URL(getCodeBase(), "Applet/pic2.png");
             img = ImageIO.read(url);
         } 
        catch (IOException e) 
        {
        } */
    }
        
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        
        //color dan saiz laptop
        Color c = new Color(246,244,242);
        g.setColor(c);
        g.drawRoundRect(0, 0, 1160, 690, 45, 45);
        g.fillRoundRect(0, 0, 1160, 690, 45, 45);
        g.setColor(Color.black);
        g.drawRoundRect(0, 0, 1160, 690, 45, 45);
        
        //color dan saiz skrin
        g.setColor(Color.black);
        g.drawRect(30, 35, 1090, 610);
        g.fillRect(30, 35, 1090, 610); 
        
        //load image
        //g.drawImage(img, 30, 35, null);
        
        //color dan saiz butang home
        //g.setColor(Color.darkGray);
        //g.drawRoundRect(125, 435, 55, 17, 15, 15);
        
        //color dan saiz panel atas
        //g.setColor(Color.darkGray);
        //g.drawRoundRect(570, 9, 55, 5, 15, 15);
        
        //color dan saiz bulat kecil pertama
        //g.setColor(Color.darkGray);
        //g.drawOval(655, 9, 5, 5);
        //g.fillOval(655, 9, 5, 5);
        
         //color dan saiz bulat kecil kedua
        g.setColor(Color.darkGray);
        g.drawOval(655, 7, 15, 15);
        g.fillOval(655, 7, 15, 15);
        
         //color dan saiz bulat kecil ketiga
        //g.setColor(Color.darkGray);
       // g.drawOval(260, 9, 6, 6);
        //g.fillOval(260, 9, 6, 6);
        
        //color dan teks jenama handphone
        Font font = new Font("Impact", Font.BOLD, 24);
        g2.setFont(font);
        g2.drawString("DELTA", 580, 25);
        
        //panel 1
        int x[] = { 800, 500, 500, 800}; 
        int y[] = { 300, 380, 630, 550}; 
        g.setColor(Color.gray);
        g.fillPolygon (x, y, 4); 
        
        
        //panel 2
        int x1[] = { 500, 500, 435, 370, 370}; 
        int y1[] = { 630, 380, 270, 330, 550}; 
        g.setColor(Color.lightGray);
        g.fillPolygon (x1, y1, 5); 
       
        //panel 3 bumbung
        int x2[] = { 435, 500, 815, 745}; 
        int y2[] = { 270, 385, 320, 205}; 
        g.setColor(Color.red);
        g.fillPolygon (x2, y2, 4); 
        
        g.setColor(Color.red);
        g.drawLine(435, 270, 366, 335);
        
        //tiang cerobong panel 1
        int x3[] = { 460, 460, 490, 490}; 
        int y3[] = { 205, 275, 270, 200}; 
        g.setColor(Color.lightGray);
        g.fillPolygon (x3, y3, 4); 
        
        //tiang cerobong panel 2
        int x4[] = { 460, 460, 430, 430, 445}; 
        int y4[] = { 205, 275, 255, 200, 175}; 
        g.setColor(Color.blue);
        g.fillPolygon (x4, y4, 5); 
 
        //bumbung cerobong
        int x5[] = { 445, 460, 500, 485}; 
        int y5[] = { 175, 205, 200, 170}; 
        g.setColor(Color.red);
        g.fillPolygon (x5, y5, 4); 

    }
}