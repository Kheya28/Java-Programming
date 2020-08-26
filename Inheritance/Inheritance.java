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
class A
{
    void m1()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    @Override
    void m1()
    {
        System.out.println("in both A & B");
    }
    void m2()
    {
        System.out.println("Only inB");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a=b;
        a.m1();
        //a.m2();  error
    }
}
