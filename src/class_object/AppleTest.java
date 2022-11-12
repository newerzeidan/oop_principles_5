package class_object;

public class AppleTest {
    public static void main(String[] args) {
    Apple apple1 = new Apple(); // class_object.Apple@1540e19d
    Apple apple2 = new Apple();
    Apple apple3 = new Apple();

        System.out.println(apple1); // class_object.Apple@1540e19d
        System.out.println(apple2); // class_object.Apple@677327b6
        System.out.println(apple3);


        System.out.println("\n-----Apple1------\n");
        System.out.println(apple1.color); // Red
        System.out.println(apple1.taste); // null
        System.out.println(apple1.price); // 0.0

        System.out.println("\n-----Apple2-----\n");
        apple2.color = "Green";
        apple2.price = 0.75;
        apple2.taste = "sour";
        System.out.println(apple2.color); // Green
        System.out.println(apple2.taste); // sour
        System.out.println(apple2.price); // 0.75


        System.out.println("\n -----Printing to String Method-----\n");
        System.out.println(apple1);
        System.out.println(apple2);

        System.out.println("\n---Apple_Exercise1---\n");
       apple1.color = "Red";
       apple1.price = 0.5;
       apple1.taste = "sweet";

        apple2.color = "Red";
        apple2.price = 0.75;
        apple2.taste = "Sweet";

        apple3.color = "Green";
        apple3.price = 1.0;
        apple3.taste = "Sour";

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

    }
}
