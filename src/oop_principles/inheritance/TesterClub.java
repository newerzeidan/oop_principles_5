package oop_principles.inheritance;

public class TesterClub {
    public static void main(String[] args) {
        FrontEndTester ft1 = new FrontEndTester("Othman", 23, "1993", "000", true);
        BackEndTester bt1 = new BackEndTester("John", 45, "1982", "111", false);
        FrontEndTester ft2 = new FrontEndTester("John", 29, "1994", "123", false);
        BackEndTester bt2 = new BackEndTester("Alex", 36, "1997", "456", false);

        Tester[] testers = {ft1, ft2, bt1, bt2}; //Polymorphic array

        /*
        Manual testers = 3
        Automation testers = 1
        Average age = 33
         */

        int countManual = 0, countAutomation = 0, sumAge = 0;

        for (Tester tester : testers) {
            if(tester.isAutomationTester) countAutomation++;
            else countManual++;

            sumAge += tester.age;
        }

        System.out.println("Manual testers = " + countManual);
        System.out.println("Automation testers = " + countAutomation);
        System.out.println("Average age = " + sumAge / testers.length);
    }
}
