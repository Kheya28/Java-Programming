/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_String_Object;
/**
 *
 * @author Kheya
 */
public class Static_class1 {
    static int a=4;
    static int b=5;
    static void hello()
    {
        System.out.println(a*b);
    }
}

class Test{
    public static void main(String[] args)
    {
        System.out.println(Static_class1.a);
        System.out.println(Static_class1.b);
        Static_class1.hello();
    }
}
