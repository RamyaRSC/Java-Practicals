class constructor {
    constructor() {
        System.out.println("Constructor method called ......................");
    }

    protected void finalize() {
        System.out.println("Garbage collected ..............");
    }
}

public class pra4b {
    public static void main(String[] args) {
        constructor ob = new constructor();
        ob = null;
        System.gc();
    }
}