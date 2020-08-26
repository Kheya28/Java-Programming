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

interface in{
    int a=4;
    static void T()
    {
        System.out.println("Hello");
    }
    
    default void D()
    {
        System.out.println("Hello");
    }
    
}
public class StaticInterface {
    public static void main(String[] args) {
        in.T();
        
    }
}
