package io.javabrains;

public class Main {

    public static void main(String[] args) {
        Greeting lambdaGreeting = () -> System.out.println("hello");
        lambdaGreeting.perform();

        GreetingImpl greeting = new GreetingImpl();
        greeting.perform();

    }
}
