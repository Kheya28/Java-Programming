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
public class Static_class {
    static int a;
    static int b;
    static void hello(int a1,int b1)
    {
        a=a1; 
        b=b1;
        int c=a*b;
        System.out.println(c);
    }
    //static{
      //  System.out.println("In static");
    //}
    public static void main(String[] args)
    {
        hello(2,3);
    }
}

