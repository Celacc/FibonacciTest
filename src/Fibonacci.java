// In this first assignment, implement an application which counts the Fibonacci number series,
// with the inputs of length of the calculated series (default 10) and starting number
// (an integer, which has to be smaller than the first printed number).
// Make the software to write the output to a file.
//

import java.io.FileWriter;
import java.io.IOException;

public class Fibonacci {
    private int length;
    private int num1;

    public Fibonacci(int num1) {
        this.num1 = num1;
        this.length = 10;
    }

    //Calculate Fibonacci numbers
    public int fib(int n1) {
        if (n1==0||n1==1 )
            return n1;
        if (n1 == -1)
            return 1;
        if (n1 < 0) { //Negative Fibonacci numbers
            int s = n1 % 2 == 0 ? -1 : 1;
            return s * fib(-n1);
        }
        return fib(n1 - 1) + fib(n1 - 2); //Positive Fibonacci numbers
    }

    //Print output
    public void printFibonacci() {
        int nextNum = this.num1;
        for (int i = 0; i < this.length; i++) {
            System.out.print(fib(nextNum) + " ");
            nextNum++;
        }
    }

    //Writing to File
    public void writeFibonacci() {
        FileWriter outputFile = null;
        try {
            outputFile = new FileWriter("FibonacciResults.txt");
            for(int i = 0; i < this.length; i++){
                outputFile.write(fib(this.num1) + " ");
                this.num1++;
            }
            outputFile.close();
        } catch (IOException e) {
            System.out.println("Error in catch");
            e.printStackTrace();
        }
    }
}


//public class Main {
//
//    public static void main(String[] args) {
//        FileWriter outputFile = null;
//        try {
//            outputFile = new FileWriter("FibonacciResults.txt");
//            int num1 = 0;
//            int num2 = 1;
//            int num3;
//            System.out.print(num1+" "+num2);
//            outputFile.write(num1 + " " + num2);
//
//            for (int i = 2; i < 10; i++) {
//                num3 = num1 + num2;
//                System.out.print(" " + num3);
//                outputFile.write( " " + num3);
//                num1 = num2;
//                num2 = num3;
//            }
//            outputFile.close();
//
//        } catch (IOException e){
//            System.out.println("Error in catch");
//            e.printStackTrace();
//        }
//    }
//}