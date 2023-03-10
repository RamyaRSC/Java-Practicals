public class threadlifecycle extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        threadlifecycle ob = new prac7b();
        ob.start();
    }
}