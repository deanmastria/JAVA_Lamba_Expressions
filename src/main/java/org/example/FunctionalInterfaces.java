package org.example;


public class FunctionalInterfaces {
    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (a, b, c) -> a + b + c;
        System.out.println("Sum of 1, 2, & 3: " + addThreeNumbers.apply(1, 2, 3));

        StringManipulator toUpperCase = (str) -> str.toUpperCase();
        System.out.println("Uppercase of 'hello there': " + toUpperCase.manipulate("hello there"));

        ConditionChecker isEven = (num) -> num % 2 == 0;
        System.out.println("Is 6 even? " + isEven.check(4));
        System.out.println("Is 7 even? " + isEven.check(7));


}
    //functional interface for trifunction (takes 3 arguments and returns a result)
    @FunctionalInterface
    interface TriFunction<A, B, C, Z> {
        Z apply (A a, B b, C c);
    }

    //functional interface for stringmanipulator (takes a string and returns a modified string)
    @FunctionalInterface
    interface StringManipulator {
        String manipulate(String str);
    }

    //functional interface for conditionchecker (takes an integer and returns a boolean result)
    @FunctionalInterface
    interface ConditionChecker {
        boolean check(int num);
    }
}
