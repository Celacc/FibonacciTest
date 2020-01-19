import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test //Testing positive index values
    void fibPos() {
        Fibonacci fibonacci = new Fibonacci(0);

        int sequenceValue = fibonacci.fib(10);
        assertEquals(55, sequenceValue, 0, "Condition not met"); //Expected 55 on index 10
    }

    @Test //Testing negative index values
    void fibNeg() {
        Fibonacci fibonacci = new Fibonacci(0);

        int sequenceValue = fibonacci.fib(-5);
        assertEquals(55, sequenceValue, 0, "Condition not met"); //Expected 5 on index -5
    }

    @Test
    void printFibonacci() {

    }

    @Test
    void writeFibonacci() {

    }
}