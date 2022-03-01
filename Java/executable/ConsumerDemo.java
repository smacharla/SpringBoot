package executable;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> cs = i -> System.out.println("Squared " + i * i);
        cs.accept(5);

        Consumer<Integer> doubleme = i -> System.out.println("Doubled " + i * 2);
        doubleme.accept(5);

        cs.andThen(doubleme).accept(5);
    }

}
