package ConcurrentProgramming;

public class CPMain implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new CPMain())).start();
    }
}
