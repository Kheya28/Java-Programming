/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.*;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
import java.awt.*;
/**
 *
 * @author sharif
 */
public class AppletTest extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        System.out.println("Init");
        //repaint();
    }
    
    @Override
    public void start(){
        System.out.println("Start");
    }

    @Override
    public void stop(){
        System.out.println("Stop");
    }
    
    @Override
    public void destroy(){
        System.out.println("Destroy");
    }
    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g){
        
        System.out.println("Paint");
        g.setColor(Color.red);
        Font f = new Font("Dialog", Font.PLAIN, 200);         
        g.setFont(f);        
        g.drawString("ICT", 100, 300);
        
        g.setColor(Color.black);
        g.drawLine(10, 100 , 500, 100);
        //setBackground(Color.YELLOW);
        //setForeground(Color.BLACK);
        showStatus("This is a status window");
        
    }
    
    
}
