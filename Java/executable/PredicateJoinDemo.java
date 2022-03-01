package executable;

import java.util.function.Predicate;

public class PredicateJoinDemo {

    public static void main(String[] args) {

        // Predicate<String> p = s -> s.length() > 5;
        Predicate<String> predDemo = s -> s.length() > 5;
        System.out.println("Length of " + predDemo.test("Hello1"));

        Predicate<String> predDemoEven = s -> s.length() % 2 == 0;
        System.out.println("Even Length of not " + predDemoEven.test("Satish Kumar M"));

        System.out.println(predDemo.and(predDemoEven).test("Hello1"));

        System.out.println(predDemo.or(predDemoEven).test("Hello6767"));

        System.out.println(predDemo.negate().test("Hello"));

    }

}
