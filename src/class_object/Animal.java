package class_object;

public class Animal {

    //Default Constructor
    public Animal(){}

    //Create a constructor that takes 2 args
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Create a constructor that takes all 5 args
    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        this(name, age);
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    //Instance Variables
    public static final boolean isExtinct = true;
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    //Custom Return Method
    @Override
    public String toString() {

        String result = "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age;

        if(isCarnivore) result +=  ", isCarnivore=" + isCarnivore;
        if(isHerbivore) result +=  ", isHerbivore=" + isHerbivore;
        if(isOmnivore) result +=  ", isOmnivore=" + isOmnivore;

        result += "}";

        return result;
    }
    // Execute the code below whenever an Animal object is garbage collected
    // You will override finalize() method if you would like to execute a block of code right after you object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println(getClass().getName() + " object is destroyed");
    }

    public static void main(String[] args) {
        //Animal a1 = new Animal();
        //Animal a2 = new Animal("Dog", 3);
        //Animal a3 = new Animal("Cow", 5);
        //Animal a4 = new Animal("Cat", 1);

        Animal a5 = new Animal("Tiger", 10, true, false, false);
        Animal a6 = new Animal("Cow", 5, false, true, false);
        Animal a7 = new Animal("Cat", 2, false, false, true);

        System.out.println("---Printing the Objects---");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

        System.out.println("\n---static instance variables---");
        System.out.println(Animal.isExtinct); //true

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

