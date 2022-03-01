package Interface;

// @FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbsMethod();

    // void s();

    default void name() {
        System.out.println("Hello");

    }

    static void name1() {

    }

}
