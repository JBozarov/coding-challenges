package io.collections;

public class ChildClass implements MyInterface{


    @Override
    public void hello() {
        MyInterface.super.helloSay();
    }

    @Override
    public void helloSay() {
        MyInterface.super.helloSay();
    }
}
