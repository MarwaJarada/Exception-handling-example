import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            throw new ExceptionB();

        } catch (ExceptionA eA) {// ExceptionB catched By it's Parent (ExceptionA)

        }

        try {
            throw new ExceptionC();
        } catch (ExceptionA eA) { // ExceptionC catched By it's Parent (ExceptionA)

        }

        //
        try {

            int num = input.nextInt();
            if (num == 0)
                throw new ExceptionA();
            else if (num == 1)
                throw new ExceptionB();
            else if (num == 2)
                throw new ExceptionC();
            else if (num == 3)
                throw new IOException();

        } catch (ExceptionC ex1) {

        } catch (ExceptionB ex2) {

        } catch (ExceptionA ex3) {

        } catch (NullPointerException ex5) {

        } catch (IOException e) {

        }

        try {
            someMethod();
        } catch (Exception e) {


        }


        for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
            System.out.println(ste);
        }

    }





    public static void someMethod() throws Exception {
        someMethod2();
    }

    public static void someMethod2 () throws Exception{
        throw new Exception();
    }
}
