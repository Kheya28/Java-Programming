/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author User
 */

interface A
{
    void rahim();
    void karim();
}

abstract class B implements A
{
  
    @Override
    public void karim() {
        System.out.println("huh");
    }
    
}

class C extends B
{

    @Override
    public void rahim() {
        System.out.println("done");
    }
    
}
public class PartialImplement {
    public static void main(String[] args) {
        A a=new C();
        a.rahim();
        
        //B a=new C();
        //a.rahim();
        //a.karim();
        
    }
}
