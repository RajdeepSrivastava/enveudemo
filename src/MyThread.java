import java.sql.SQLOutput;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);

        System.out.println(t1.getState());
        t1.join();

        System.out.println(t1.getState());

        String temp = "For checking ";
        System.out.println(temp);

        String temp2 = "Aagaain checking........";
        System.out.println(temp2);
    }
}
