package class_object;

public class Student {

    public Student() {
    }

        //Create a constructor that takes 2 args
       //Define public instance variables of Students class as below
       //firstName, lastName, age


    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        addStudent();
    }

    public static int numberOfStudents = 0;
       public static final String program = "Software Engineer in Test Program";

       public String firstName;
       public String lastName;
       public int age;

       public void study(){
           System.out.println("Student studies");
       }

       public void rest(){
           System.out.println(this.firstName + " " + this.lastName+ " rests");
       }

       public static void addStudent(){
          numberOfStudents++;
       }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
