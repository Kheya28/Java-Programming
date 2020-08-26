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
public class Throw {
    public void hello()
    {
        throw new ArithmeticException("Not valid");
    }
    
    public static void main(String[] args) {
       Throw th=new Throw();
        try{
            th.hello();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
            
        }
    }
    
}
