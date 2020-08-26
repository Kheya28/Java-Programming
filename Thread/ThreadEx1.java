/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author User
 */
class A extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello");
    }
}
public class ThreadEx1 {
    public static void main(String[] args) {
        A obj=new A();
        obj.start();
    }
}
