package oop_principles.inheritance;

public class Person {

    //Default Constructor is here
    public Person(){}

    //Create 2-arg constructor with fName and age
    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }

    //Create 3-arg constructor with fName, age, DOB
    public Person(String fName, int age, String DOB) {
        this(fName, age);
        this.DOB = DOB;
    }

    //Create 4-arg constructor with all fields
    public Person(String fName, int age, String DOB, String SSN) {
        this(fName, age, DOB);
        this.SSN = SSN;
    }

    //Instance Variables
    public String fName;
    protected int age;
    String DOB;
    private String SSN;

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void eat(){
        System.out.println("Person eats");
    }

    //Overload eat method with a String Argument
    public void eat(String str){
        System.out.println("Person eats " + str);
    }

    public void sleep(){
        System.out.println("Person sleeps");
    }

    //Overload sleep method with an int Argument
    public void sleep(int hours){
        System.out.println("Person sleeps " + hours + " hours");
    }

    //Override toString() Method
    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
