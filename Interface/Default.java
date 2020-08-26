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
interface Def{
    default void D()
    {
        System.out.println("Hello");
    }
}
class Yo implements Def{
    
}
public class Default {
    public static void main(String[] args) {
        Def d=new Yo();
        d.D();
       
    }
}
