/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

class p1{
    int d=4;
    void hello()
    {
        System.out.println("superclass");
    }
}

class Q1 extends p1
{
    void hello1()
    {
        super.d=9;
        hello();
        System.out.println("subclass");
    }
}
public class Super {
    public static void main(String[] args) {
       //super.d;
       //super.hello();
       Q1 obj=new Q1();
       obj.hello1();
       
    }
}
