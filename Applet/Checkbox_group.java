/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

// Demonstrate check box group.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="CBGroup" width=240 height=200>
</applet>
*/
public class Checkbox_group extends Applet implements ItemListener 
{
    String msg = "";
    Checkbox windows, android, solaris, mac;
    CheckboxGroup cbg;

    @Override
    public void init() 
    {
        cbg = new CheckboxGroup();
        windows = new Checkbox("Windows", cbg, true);
        android = new Checkbox("Android", cbg, false);
        solaris = new Checkbox("Solaris", cbg, false);
        mac = new Checkbox("Mac OS", cbg, false);
        add(windows);
        add(android);
        add(solaris);
        add(mac);
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        repaint();
    }
// Display current state of the check boxes.
    @Override
    public void paint(Graphics g) 
    {
        msg = "Current selection: ";
        msg += cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 6, 100);
    }
}