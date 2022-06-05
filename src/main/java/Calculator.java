import java.util.*;
import java.lang.*;
import java.io.*;

public class Calculator {

    public int adding(int a, int b) {
        return a + b;
    }

    public int subtracting(int a, int b) {
        return a - b;
    }
}

class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.adding(12,7);
        int result2 = calculator.subtracting(12,7);
        System.out.println("We will adding and subtracting numbers 12 and 7.");
        System.out.println("The result of adding is: " + result1);
        System.out.println("The result of subtracting is: " + result2);
    }
}
