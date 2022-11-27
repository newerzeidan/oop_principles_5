package mutable_immutable;

public class Exercise01 {
    /*
    Create a method that takes a String and returns a String
    if the given String has even length and length is at least 2, then insert * in the middle of the String
    aa     -> a*a
    java   -> ja*va
    yoanna -> yoa*nna

    if the given String has odd length and length is at least 3, then insert * before and after the middle character
    aaa   -> a*a*a
    olena -> ol*e*na

    if the given String is empty or has length of 1, then return the String itself
    a -> a
      ->
     */
    public static String insertStar(String str){
        if(str.length() <= 1) return str;

        if(str.length() % 2 == 0){
            return new StringBuilder(str).insert(str.length() / 2, "*").toString();
        }
        else{
            return new StringBuilder(str).insert(str.length() / 2, "*").insert(str.length() / 2 + 2, "*").toString();
        }
    }


    public static void main(String[] args) {
        System.out.println(insertStar("")); //
        System.out.println(insertStar("a")); //a
        System.out.println(insertStar("aa")); //a*a
        System.out.println(insertStar("aaa")); //a*a*a
        System.out.println(insertStar("aaaa")); //aa*aa
        System.out.println(insertStar("aaaaa")); //aa*a*aa
        System.out.println(insertStar("aaaaaa")); //aaa*aaa
    }
}