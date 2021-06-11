package io.collections;

interface MyInterface {
    void hello();

    default void helloSay(){
        System.out.println("hello");
    }
}