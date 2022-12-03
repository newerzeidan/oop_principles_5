package oop_principles.abstraction;

public class Nokia extends Phone{

    @Override
    public void call() {
        System.out.println("Nokia way of call");
    }

    @Override
    public void text() {
        System.out.println("Nokia way of text");
    }

}