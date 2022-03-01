package executable;

import Interface.FunctionalInterfaceDemo;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImpl;
        functionalInterfaceDemo.singleAbsMethod();

        // FunctionalInterfaceDemo f = () -> System.out.println("Impl of SAM");
        // f.singleAbsMethod();
    }
}

class Test {
    public static void testImpl() {
        System.out.println("Test Implementation of Abst method");
    }
}