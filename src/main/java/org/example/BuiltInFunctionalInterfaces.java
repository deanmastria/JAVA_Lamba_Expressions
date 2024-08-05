package org.example;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Consumer;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {

        //Predicate to check if a number is even
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.printf("Is 2 Even? " + isEven.test(2));
        System.out.println("Is 3 even? " + isEven.test(3));

        //Convert to modify the string to uppercase
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
        System.out.println("Uppercase of 'what's Up: " + toUpperCase.apply("what's"));

        //Consumer to print a string
        Consumer<String> printString = (str) -> System.out.println("Printing " + str);
        printString.accept("Hello");

        //Supplier to generate a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number " + randomSupplier.get());
    }
}
