/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sharif
 */
public class ButtonTest extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int d = 0;
    @Override
    public void init() {
        //Button create
        Button btn = new Button();
        //Button btn = new Button("ICT");
        btn.setLabel("ICT");
      
        setLayout(new FlowLayout(FlowLayout.LEFT));
        //Add panel to container
        Panel p = new Panel();
        //setLayout(new FlowLayout(FlowLayout.LEFT));
         //Panel p1 = new Panel();
        add(p);
        //p1.add(btn);
        
        //Add button to panel
        p.add(btn);
        
        //Implementing ActionListener interface
        //Registration of components
        btn.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        d++;
        //paint(getGraphics());
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        //Graphics g = getGraphics();
        g.setFont(new Font("Times New Roman",Font.BOLD,20));
        g.drawString("Button is pressed "+" = "+d+" times" , 200, 400);
    }
}
