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
public class SetData_GetData {
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
    
    public static void main(String[] args)
    {
        SetData_GetData obj=new SetData_GetData();
        SetData_GetData obj1=new SetData_GetData();
        obj.Setdata(2,4);
        obj1.Setdata(3,4.5);
        obj.Getdata();
        obj1.Getdata();
    }
    
}


