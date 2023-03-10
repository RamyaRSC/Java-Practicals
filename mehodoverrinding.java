class A {
    public void add() {
        int a = 2, b = 3, c;
        c = a + b;
        System.out.println("Addition of 2 and 3 is " + c);
    }
}

class B extends A {
    public void add() {
        super.add();
        int a = 5, b = 1, c;
        c = a + b;
        System.out.println("Addition of 5 and 1 is " + c);
    }
}

class methodoverrinding {
    public static void main(String[] args) {
        B b = new B();
        b.add();
    }
}