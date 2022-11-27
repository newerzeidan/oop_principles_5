package mutable_immutable;

public class ReverseString {
    /*
    Write a method that takes a String and returns it back reversed

    Hello -> olleH
    Java  -> avaJ
          ->
    a     -> a
    1234  -> 4321
    Good morning -> gninrom dooG
     */
    public static String reverseString(String str){
        StringBuilder result = new StringBuilder(str); //Hello
        result.reverse();
        return  new StringBuilder(str).reverse().toString();

        /*
         This is the old way
         for (int i = str.length() - 1; i >= 0; i--) {
             result.append(str.charAt(i));
         }
         return result.toString();
         */
    }

    //Create a method that takes a string and returns boolean if it is a palindrome
    public static boolean isPalindrome(String str){
        //return str.equals(new StringBuilder(str).reverse().toString());
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println("---reverseString() Method---");
        System.out.println(reverseString("Hello")); //olleH
        System.out.println(reverseString("Java")); //avaJ
        System.out.println(reverseString("")); //
        System.out.println(reverseString("a")); //a
        System.out.println(reverseString("1234")); //4321
        System.out.println(reverseString("Good morning")); //gninrom dooG


        System.out.println("\n---isPalindrome() Method---");
        System.out.println(isPalindrome("civic")); // true
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("Madam")); // false
        System.out.println(isPalindrome("hello")); // false
    }
}