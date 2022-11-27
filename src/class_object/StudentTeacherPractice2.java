package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {

          /*
        Create a Teacher object   -> Alex Smith
        Create 4 Student objects  -> John Doe 15
                                  -> Jane Doe 20
                                  -> Mike Lion 25
                                  -> Robert Smith 50


        Add students to Teacher Student List
        Find the age difference bt the oldest and youngest student

        Expected output:
        35
         */
        Teacher teacher = new Teacher("Alex", "Smith");


        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Lion", 25);
        Student student4 = new Student("Robert", "Smith", 50);

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;

        for (Student student : teacher.getStudents()) {
            if (student.age > maxAge) maxAge = student.age;
            if (student.age < minAge) minAge = student.age;
        }
            System.out.println(maxAge - minAge);
    }


}
