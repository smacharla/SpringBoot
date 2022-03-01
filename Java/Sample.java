public class Sample {

    public static void main(String[] args) {
        System.out.println("Hello");

        for (int i = 0; i < 10; i++)
            System.out.println("first I is " + i);
        // System.out.println("final i " + i);

        int j = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
            j += i;
        }
        System.out.println("final J " + j);
    }

    public void dostuff(int i) {
        System.out.println("i in do stuff" + i);

    }

}
