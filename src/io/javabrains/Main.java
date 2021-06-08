package io.javabrains;

public class Main {

    public static void main(String[] args) {
        Greeting lambdaGreeting = () -> System.out.println("hello");
        lambdaGreeting.perform();

        GreetingImpl greeting = new GreetingImpl();
        greeting.perform();

        FunctionalInterfaceImpl functionalImterfaceImpl = new FunctionalInterfaceImpl();
        functionalImterfaceImpl.consuterMethod(23);

        // Lambda
        Functionalnterface functionalInterface = (b) -> System.out.println("Functiona interface and param is: " + b);
        functionalInterface.consuterMethod(2233);

    }
}
