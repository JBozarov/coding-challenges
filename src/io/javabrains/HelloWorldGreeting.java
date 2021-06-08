package io.javabrains;

public class HelloWorldGreeting {

    public static void main(String[] args) {
        Greeting lambdaGreeting = () -> System.out.println("hello");

        lambdaGreeting.perform();
    }
}
