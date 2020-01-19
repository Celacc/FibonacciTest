// In this first assignment, implement an application which counts the Fibonacci number series,
// with the inputs of
// length of the calculated series (default 10)
// and starting number (an integer, which has to be smaller than the first printed number).
// Make the software to write the output to a file.


public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(0); //Starting index as input


        //Ask input from user
//        fibonacci.inputNumber(); //Starting number input
//        fibonacci.inputLength(); //Sequence length input

        fibonacci.printFibonacci(); //Print output
        fibonacci.writeFibonacci(); //Write to file
    }
}
