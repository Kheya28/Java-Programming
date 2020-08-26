/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author User
 */
class A1
{
    int i;
}
class B1 extends A1
{
    int i;
    B1(int a,int b)
    {
        super.i=a;
        i=b;
    }
    
    void show()
    {
        System.out.println("superclass: "+super.i);
        System.out.println("subclass: "+i);
    }
}
public class Super_second_use {
    public static void main(String[] args) {
        B1 ob=new B1(2,3);
        ob.show();
    }
}
