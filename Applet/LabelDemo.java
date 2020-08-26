/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

// Demonstrate Labels 
import java.awt.*; 
import java.applet.*; 
/* 
<applet code="LabelDemo" width=300 height=200> 
</applet> 
*/ 
 
public class LabelDemo extends Applet { 
  @Override
  public void init() { 
    Label one = new Label("One"); 
    Label two = new Label("Two"); 
    Label three = new Label("Three"); 
    // add labels to applet window 
    add(one); 
    add(two); 
    add(three); 
  } 
}