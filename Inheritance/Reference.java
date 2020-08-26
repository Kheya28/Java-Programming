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
class A2
{
    void huh()
    {
        System.out.println("supper");
    }
}
class B2 extends A2
{
    void huh()
    {
        System.out.println("sub!");
    }
    void huh1()
    {
        System.out.println("dfghjk");
    }
}

public class Reference {
    public static void main(String[] args) {
        A2 a=new A2();
        B2 b=new B2();
        a=b;
        a.huh();
        //a.huh1();
    }
}
