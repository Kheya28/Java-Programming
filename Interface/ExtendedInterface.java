/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author User
 */

interface P
{
    void m1();
    void m2();
}

interface Q extends P
{
    void m3();
}

class R implements Q
{

    @Override
    public void m3() {
        System.out.println("m3");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }
    
}
public class ExtendedInterface {
    public static void main(String[] args) {
        Q ob=new R();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}
