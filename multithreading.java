class one extends Thread {
    public void run() {
        for (int i = 0; i <= 7; i++) {
            System.out.println(" " + i + " syit ");
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
                System.out.println(" Excpetion is " + ex);
            }
        }
    }
}

class second extends Thread {
    public void run() {
        for (int i = 0; i <= 7; i++) {
            System.out.println(" " + i + " Fyit ");
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
                System.out.println(" Excpetion is " + ex);
            }
        }
    }
}

class multithreading {
    public static void main(String[] args) {
        one o = new one();
        second s = new second();
        o.start();
        s.start();
    }
}
