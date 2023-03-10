import java.util.*;

class employee {
    String name = "siddhesh";
    int sal = 25000;
}

class manager extends employee {
    String mname = "abc";
}

class executive extends manager {
    String loc = "kharghar";

    public void display() {
        System.out.println("Name of employee is " + name);
        System.out.println("Salary of employee is " + sal);
        System.out.println("manager name is " + mname);
    }
}

public class multiinheritance {
    public static void main(String[] args) {
        executive e = new executive();
        e.display();
        System.out.println("location " + e.loc);
    }
}