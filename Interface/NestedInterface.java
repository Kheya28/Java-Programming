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
interface A1{
    void a_method();
    interface nested{
        void nes_method();
    }
}

class yoo implements A1.nested{

    @Override
    public void nes_method() {
        System.out.println("hehe..i did it");
    }
    
}
public class NestedInterface {
    public static void main(String[] args) {
        A1.nested n=new yoo();
        n.nes_method();
    }
}
