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
public class Base {
    int i,j;
}

class Child extends Base
{
    int i,j;
    Child(int a,int b)
    {
        super.i=a;
        super.j=b;
    }
}

class Main
{
    void isEvenOrOdd(int x)
    {
        if((x%2)==0)
        {
            System.out.println("x is even");
            
        }
        else if(x%2!=0)
        {
            System.out.println("x is odd");
        }
    }
    
    public static void main(String[] args) {
        Base obj1=new Base();
        Child obj2=new Child(4,7);
        Main obj3=new Main();
        
        
        obj3.isEvenOrOdd(obj1.i);
        
        obj3.isEvenOrOdd(obj1.j);
        
    }
}