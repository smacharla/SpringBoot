package executable;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredecateBiFunctionDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bPredicate = (a, b) -> a * b > 5;
        System.out.println("BiPredecate " + bPredicate.test(2, 5));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println("BiFunction " + biFunction.apply(4, 5));

    }

}
