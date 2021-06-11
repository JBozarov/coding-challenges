package io.javabrains;

import java.util.function.Predicate;

public class FunctionalInterfaceImpl implements Functionalnterface {
    @Override
    public void consuterMethod(int a) {
        System.out.println("Hello this is impl " + a);
    }
}
