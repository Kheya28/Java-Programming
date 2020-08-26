package Streams;

/**
 *
 * @author User
 */
public class Throws {
    void method1() throws ArithmeticException
    {      
        throw new ArithmeticException("Not fair");    
    }
    
    void method2() throws ArithmeticException
    {      
         method1();
    }
    
    void method3()
    {
        try{
         method2();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public static void main(String[] args) {
        Throws th=new Throws();
        th.method3();
    }

}