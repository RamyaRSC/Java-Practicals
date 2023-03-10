abstract class Nm {
    public abstract int sqr(int a);

    public void disp() {
        System.out.println("Heyyy");
    }
}

public class abstractclass extends Nm {
    public int sqr(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        abstractclass p = new pra4c();
        int a = p.sqr(4);
        System.out.println(a);
        p.disp();
    }
}
