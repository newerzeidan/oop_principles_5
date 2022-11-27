package oop_principles.encapsulation;

public class Company {

    //Create Default Constructor
    public Company(){}

    //Create 3-args Constructor
    public Company(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //Create instance variables name, address, phone and encapsulate them
    private String name;
    private String address;
    private String phone;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }


    //override toString() Method
    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}