/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

/**
 *
 * @author User
 */
public class OwnException {
    static void hello() throws MyException
    {
        throw new MyException("My");
    }
    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException e)
        {
            System.out.println("caught: "+e);
            //System.out.println("caught: "+e.toString());
            System.out.println("caught: "+e.getMessage());
        }
    }
}

class MyException extends Exception
{
    MyException()
    {
       super();
    }
    MyException(String st)
    {
        super(st);
    }
}
