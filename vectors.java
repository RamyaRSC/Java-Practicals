import java.util.*;

public class vectors {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(20);
        v.add("Red");
        v.add("Blue");
        v.add("Red");
        System.out.println(v);
        System.out.println(v.get(2));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.add(2, "Yellow");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
