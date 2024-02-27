package org.sephora.day2.exception;

/**
 * java.lang.Throwable is the super class for all type of errors and exceptions in Java
 * 3 types: Checked, Unchecked, Error
 * Checked: Directly inherit the Throwable class, eg: SQLException
 * Unchecked: Runtime exception, eg: NullPointerException
 * Error: eg: OutOfMemoryException
 * https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/lang/package-summary.html
 */
public class ThrowExceptionExample {

    void exceptionMethod() throws ArithmeticException {
        System.out.println("inside exceptionMethod()");
//        throw new OurCustomException(400, "iput is not");

        throw new ArithmeticException("throwing Arithmetic Exception");
    }

    public static void main(String[] args) {
        ThrowExceptionExample example = new ThrowExceptionExample();
        try {
            example.exceptionMethod();
        } catch (
                ArithmeticException exception) { // must be parent class exception. Good approach is to declare generated type
            System.out.println("Exception handled");
        }catch (Exception e){
            //
        } finally {
            System.out.println("Finally called"); // always executed, multiple catch blocks but only 1 finally block per try
        }
        System.out.println("Rest of code");
    }
}
