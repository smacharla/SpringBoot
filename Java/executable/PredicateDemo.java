package executable;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("Satish Kumar M"));

        // PredicateDemo pDemo = new PredicateDemo();
        // System.out.println("Checking--->" + pDemo.Check("Hello Dear"));
    }

    public boolean Check(String a) {
        if (a.length() > 5)
            return true;
        else
            return false;
    }
}
