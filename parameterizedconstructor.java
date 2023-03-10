import java.util.*;

class AgeException extends Exception {
    String st1;

    AgeException(String s) {
        st1 = s;
    }

    public String toString() {
        return (st1);
    }
}

public class parameterizedconstructor {
    static int roll_no, age;
    static String name, course;

    prac9c(int roll_no, int age, String name, String course) {
        this.roll_no = roll_no;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public static void main(String[] args) {
        try {
            Scanner S = new Scanner(System.in);
            System.out.print("Enter roll no ");
            roll_no = S.nextInt();
            System.out.print("Enter Age ");
            age = S.nextInt();
            System.out.print("Enter name ");
            name = S.next();
            System.out.print("Enter Course ");
            course = S.next();
            if (age >= 15 && age <= 21) {
                System.out.println(" \n Students details \n");
                System.out.println("Student name is " + name);
                System.out.println("Student roll no is " + roll_no);
                System.out.println("Student age is " + age);
                System.out.println("Student course is " + course);
            } else {
                throw new AgeException("Age not within Correct Range");
            }
        } catch (AgeException ae) {
            System.out.println(ae);
        }
    }
}
