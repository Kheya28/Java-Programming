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
public class Two_Class{
       double height;
    double width;
    
    void Setdata(double a,double b)
    {
        height=a;
        width=b;
    }
    
    void Getdata()
    {
        System.out.println(height*width);
    }
       
}
class first_class{
    int a;
    int b;
    
    void Setdata(int a1,int b1)
    {
        a=a1;
        b=b1;
    }
    
    void Getdata()
    {
        System.out.println(a*b);
    }
    public static void main(String[] args)
    {
        Two_Class obj=new Two_Class();
        obj.Setdata(2,3);
        obj.Getdata();
        
        first_class obj1=new first_class();
        obj1.Setdata(4, 5);
        obj1.Getdata();
    }
}
