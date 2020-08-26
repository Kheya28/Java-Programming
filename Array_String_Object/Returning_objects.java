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
public class Returning_objects {
    int a;
    Returning_objects(int a1)
    {
        a=a1;
    }
    
    Returning_objects hello()
    {
        Returning_objects obj=new Returning_objects(3);
        return obj;
    }
}

class new_class{
    public static void main(String[] args)
    {
        Returning_objects obj1=new Returning_objects(2);
        Returning_objects obj2;
        
        obj2=obj1.hello();
        System.out.println(obj1.a);
         System.out.println(obj2.a);
    }
}
