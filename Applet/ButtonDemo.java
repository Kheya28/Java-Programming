/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;


// Demonstrate Buttons 
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
/* 
  <applet code="ButtonDemo" width=250 height=150> 
  </applet> 
*/ 
 
public class ButtonDemo extends Applet implements ActionListener { 
  String msg = ""; 
  Button yes, no, maybe; 
 
  @Override
  public void init() { 
    yes = new Button("Yes"); 
    no = new Button("No"); 
    maybe = new Button("Undecided"); 
 
    add(yes); 
    add(no); 
    add(maybe); 
 
    yes.addActionListener(this); 
    no.addActionListener(this); 
    maybe.addActionListener(this); 
  } 
 
  @Override
  public void actionPerformed(ActionEvent ae) { 
    String str = ae.getActionCommand(); 
 
    if(str.equals("Yes")) { 
      msg = "You pressed Yes."; 
    } 
    else if(str.equals("No")) { 
      msg = "You pressed No."; 
    } 
    else { 
      msg = "You pressed Undecided."; 
    } 
 
   //paint(getGraphics()); 
   repaint();
 
  } 
 
  @Override
  public void paint(Graphics g) { 
     g.drawString(msg, 6, 100); 
  } 
}
