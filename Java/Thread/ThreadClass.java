package Thread;

public class ThreadClass extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread Class " + i);
            System.out.println("Am I the Deamon Thread " + Thread.currentThread().isDaemon());
        }

    }

}
