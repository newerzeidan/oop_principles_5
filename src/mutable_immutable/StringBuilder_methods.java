package mutable_immutable;

public class StringBuilder_methods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Alex");
        System.out.println(sb);// Alex

        sb.append("ander");

        System.out.println(sb); // Alexander

        sb.append(123);
        sb.append(5.3);
        sb.append('$');

        System.out.println(sb); // Alexander1235.3$
        sb.insert(0, "xxx");
        System.out.println(sb); // xxxAlexander1235.3$

        sb = sb.reverse();

        System.out.println(sb); // $3.5321rednaxelAxxx


    }
}
