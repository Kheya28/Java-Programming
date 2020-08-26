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
public class Constructor {
    int a=1;
    int b=1;
    int c=1;
    
    Constructor()
    {
        System.out.println("Yup,it works");
        a=2;
        b=3;
        c=2;
    }
    Constructor(int d)
    {
        System.out.println("Yup,second works");
        a=d;
    }
    
    void getdata()
    {
        System.out.println(a*b*c);
    }
    
    public static void main(String[] args)
    {
        Constructor obj=new Constructor(3);
        obj.getdata();
        
        Constructor obj1=new Constructor();
        obj1.getdata();
    }
}
