/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Object;
/**
 *
 * @author Kheya
 */
public class Overloading {
    void hello()
    {
        System.out.println("no parameters");
        
    }
    
    void hello(int a)
    {
        System.out.println("one parameter");
        
    }
    
    void hello(int a,int b)
    {
        System.out.println("two parameters");
        
    }
    
    public static void main(String[] args)
    {
        Overloading obj=new Overloading();
        obj.hello();
        obj.hello(2);
        obj.hello(4,2);
    }
    
}
