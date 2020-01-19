//Then, create a xUnit test automation script for your program to test out that the application works.
// Try to implement at least 3 different types of tests (input, output, attributes, faulty input etc.).
// Include a proof that your xUnit tool works, by changing the code so that your xUnit tests fail.

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test //Testing positive index values
    void fibPos() {
        Fibonacci fibonacci = new Fibonacci(0);

        int indexNumber = fibonacci.fib(10);
        assertEquals(55, indexNumber, 0, "Condition not met in fibPos"); //Expected 55 on index 10
    }

    @Test //Testing negative index values
    void fibNeg() {
        Fibonacci fibonacci = new Fibonacci(0);

        int indexNumber = fibonacci.fib(-5);
        assertEquals(5, indexNumber, 0, "Condition not met in fibNeg"); //Expected 5 on index -5
    }

    @Test //Testing text file creation as output.
    void writeFibonacci() {
        Fibonacci fibonacci = new Fibonacci(0);
        fibonacci.writeFibonacci();

        File f = new File("FibonacciResults.txt");
        assertTrue(f.exists(), "File does not exist");
    }
}