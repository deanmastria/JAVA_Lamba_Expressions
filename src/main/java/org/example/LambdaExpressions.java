package org.example;



public class LambdaExpressions {
    public static void main(String[] args) {

        //Lambda Expressions
        ArithmeticOperation addition = (a, b) -> a + b;
        ArithmeticOperation subtraction = (a, b) -> a - b;
        ArithmeticOperation multiplication = (a, b) -> a * b;
        ArithmeticOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero, cannot divide by zero");
            }
            return a / b;
        };

        //Tests for the expressions
        System.out.printf("\nAddition " + testOperation(addition, 10, 3));
        System.out.printf("\nSubtraction " + testOperation(subtraction, 10, 3));
        System.out.printf("\nMultiplication " + testOperation(multiplication, 15, 3));
        System.out.printf("\nDivision " + testOperation(division, 15, 3));
        System.out.println(" ");


        //test for throw, check if exception is handled
        try {
            System.out.println("Division by zero" + testOperation(division, 5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    //functional interface for lambda expressions
    @FunctionalInterface
    interface ArithmeticOperation {
        double operate(double a, double b);
    }


    //Test Method for lambda expressions
    public static double testOperation(ArithmeticOperation operation, double a, double b) {
        return operation.operate(a, b);
    }
}

