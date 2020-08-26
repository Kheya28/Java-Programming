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
public class Object_as_parameter {
    int a;
    int b;
    
    Object_as_parameter(int c,int d)
    {
        a=c;
        b=d;
    }
    void test(Object_as_parameter obj)
    {
        if(obj.a==a&&obj.b==b)
        {
            System.out.println("Matching Matching");
        }
        else
            System.out.println("Nope");
    }
    
    public static void main(String[] args)
    {
        Object_as_parameter obj1=new Object_as_parameter(20,40);
        Object_as_parameter obj2=new Object_as_parameter(20,40);
        Object_as_parameter obj3=new Object_as_parameter(21,41);
        
        obj1.test(obj3);
        obj1.test(obj2);
    }
    
}
