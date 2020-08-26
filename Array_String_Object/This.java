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
public class This {
    double a;
    double b;
    
    void Setdata(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    
    void Getdata()
    {
        System.out.println(a*b);
    }
    
    public static void main(String[] args)
    {
        SetData_GetData obj=new SetData_GetData();
        obj.Setdata(2,4);
        obj.Getdata();

    }
    
}
