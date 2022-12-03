package oop_principles.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung();
        System.out.println("Printing out Samsung call/text: ");
        s1.call();
        s1.text();

        iPhone i1 = new iPhone();
        System.out.println("\nPrinting out iPhone call/Text: ");
        i1.call();
        i1.text();

        Samsung s2 = new Samsung(64, "Galaxy S20", "Black", 700);
        iPhone i2 = new iPhone(128, "14 Pro", "Silver", 750);

        System.out.println("\nPrinting out Samsung/iPhone Device Information: ");
        System.out.println(s2);
        System.out.println(i2);

        System.out.println("\nPrinting out Samsung/iPhone Photo and Video: ");
        s2.takesPhoto();
        s2.recordVideo();
        i2.takesPhoto();
        i2.recordVideo();
    }
}