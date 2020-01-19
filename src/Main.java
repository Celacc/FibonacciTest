// In this first assignment, implement an application which counts the Fibonacci number series,
// with the inputs of
// length of the calculated series (default 10)
// and starting number (an integer, which has to be smaller than the first printed number).

// Make the software to write the output to a file.


import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(-10); //Starting number in the sequence & length of sequence
        fibonacci.printFibonacci();
        fibonacci.writeFibonacci();

    }
}


//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//        int n=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please entered number");
//        n=sc.nextInt();
//        System.out.println("You have entered "+n);
//        int f1, f2=0, f3=1;
//        for(int i=1;i<=n;i++){
//            System.out.print(" "+-(int)Math.pow(-1,i)*f3+" ");
//            f1 = f2;
//            f2 = f3;
//            f3 = f1 + f2;
//        }
//    }
//}