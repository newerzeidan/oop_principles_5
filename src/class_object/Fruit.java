package class_object;

public class Fruit {

    public static boolean hasColor;
    public boolean isSweet = true;
    public String name;
    public String shape;

        //Instance block is being executed for each object being created
    {
        System.out.println("This is an instance block");
    }
    static {
        //connect to file here and read data
        hasColor = true;
        System.out.println("This is a static block");
    }
}