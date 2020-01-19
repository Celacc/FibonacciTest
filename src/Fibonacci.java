// In this first assignment, implement an application which counts the Fibonacci number series,
// with the inputs of length of the calculated series (default 10) and starting number
// (an integer, which has to be smaller than the first printed number).
// Make the software to write the output to a file.
//

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    private int length;
    private int num1;

    public Fibonacci(int num1) {
        this.num1 = num1;
        this.length = 10; //default length
    }

    public int getNum1() {
        return this.num1;
    }

    //User input for starting number
    public int inputNumber () {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        while(true){
            System.out.println("Please select a starting index number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                 inputNumber += scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid value. Please use only integers.");
            }
            scanner.nextLine();
            scanner.close();
        }
        this.num1 = inputNumber;
        return this.num1;
    }

    //User input for sequence length
    public int inputLength () {
        Scanner scanner = new Scanner(System.in);
        int inputLen = 0;
        while(true){
            System.out.println("Please select the length of the Fibonacci sequence: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                inputLen += scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid value. Please use only integers.");
            }
            scanner.nextLine();
            scanner.close();
        }
        this.length = inputLen;
        return this.length;
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
