package _04interfaces;

import java.io.Closeable;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.rmi.server.LogStream;

public class test {
    public static void main(String[] args) {
        if(System.out instanceof PrintStream){
            System.out.println("true1");
        }
        if(System.out instanceof OutputStream){
            System.out.println("true2");
        }
        if(System.out instanceof LogStream){
            System.out.println("true3");
        }
        if(System.out instanceof Object){
            System.out.println("true4");
        }
        if(System.out instanceof Closeable){
            System.out.println("true5");
        }

    }
}
