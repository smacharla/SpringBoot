package Thread;

public class ThreadMain {

    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        tc.setDaemon(true);
        tc.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("From Main Class " + i);
        }
    }

}
