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
public class OuterClass {
    int a;
    void test()
    {
        for(int i=0;i<5;i++)
        {
            class inner
            {
                void hello()
                {
                    System.out.println("wow");
                }
            }
            inner obj=new inner();
            obj.hello();
            
        }
        
    }
    public static void main(String[] args) {
        OuterClass ob=new OuterClass();
        ob.test();
    }
}
