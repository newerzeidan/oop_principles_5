package oop_principles.abstraction;

public interface Camera {

    void takesPhoto();
    void recordVideo();

    default void method1(){ //Showing that methods can be used in interfaces
        System.out.println("This is a default method");
    }

    static void method2(){ //Showing that methods can be used in interfaces
        System.out.println("This is a static method");
    }
}