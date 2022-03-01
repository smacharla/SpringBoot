package executable;

public class Executable {
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (var i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] is " + args[i]);
        }
        System.out.println("no More");
    }

}
