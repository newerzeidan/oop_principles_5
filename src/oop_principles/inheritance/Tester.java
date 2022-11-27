package oop_principles.inheritance;

public class Tester extends Person{ // extending person class to tester class

    //Default Constructor
    public Tester(){}

    //2-args Constructor
    public Tester(String fName, int age){
        super(fName, age); // super uses the constructor info from the Person class (Parent)
    }

    //3-args Constructor
    public Tester(String fName, int age, String DOB){
        super(fName, age, DOB);
    }

    //4-args Constructor
    public Tester(String fName, int age, String DOB, String SSN){
        super(fName, age, DOB, SSN);
    }

    //5-args Constructor
    public Tester(String fName, int age, String DOB, String SSN, boolean isAutomationTester){
        super(fName, age, DOB, SSN);
        this.isAutomationTester = isAutomationTester;
    }

    public boolean isAutomationTester;

    public void code(){
        System.out.println("Tester codes");
    }

    //Overload code() Method
    public void code(String language){
        System.out.println("Tester codes in " + language + " language");
    }

    //Overriding eat() Method for Tester
    @Override
    public void eat(){
        System.out.println("Tester eats");
    }

    //Overriding eat(String str) Method
    @Override
    public void eat(String str){
        System.out.println("Tester eats " + str);
    }

    //Overriding sleep() Method for Tester
    @Override
    public void sleep(){
        System.out.println("Tester sleeps");
    }

    //Overriding sleep(int hours) Method for Tester
    @Override
    public void sleep(int hours){
        System.out.println("Tester sleeps " + hours + " hours");
    }

    //Override toString() Method
    @Override
    public String toString() {
        return "Tester{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + getSSN() + '\'' +
                ", isAutomationTester=" + isAutomationTester +
                '}';
    }
}
