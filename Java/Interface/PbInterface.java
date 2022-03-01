package Interface;

public interface PbInterface {

    // private void test() {

    // }

    default int test1() {

        System.out.println("From Interface");
        return 0;

    }

    default void name() {
        System.out.println("PbInterface Hello");

    }
}