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
public class Try_program {
    int a;
    int b;
    Try_program(int t)
    {
        a=t;
        b=3;
    }
    
    int hello()
    {
        int c=a+b;
        return c;
    }
    
    public static void main(String[] args)
    {
        Try_program huh=new Try_program(4);
        Try_program hh=new Try_program(2);
        int d=huh.hello();
        int d1=hh.hello();
        for(int i=1;i<=10;i++){
            d=d+1;
           System.out.println("Answer = "+d); 
           System.out.println("Another ans = "+d1);
        }
            
    }
    
}
