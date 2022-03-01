package package1;

import java.util.function.BiConsumer;
import package1.subpackage.ClassA;

public class package1 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.toString());

        BiConsumer<Integer, Integer> biConsumer = (b, c) -> System.out.println(b + c);
        biConsumer.accept(10, 5);
    }
}