package Implementations;

import Interface.FunctionalInterfaceDemo;
import Interface.InterStatic;
import Interface.PbInterface;

public class PbImpl implements PbInterface, FunctionalInterfaceDemo, InterStatic {

    public static void main(String[] args) {
        PbImpl pb = new PbImpl();
        // pb.name1();

        // InterStatic.name1();

    }

    // @Override
    // public static void name1() {
    // InterStatic.name1();
    // System.out.println("in Impl class");

    // }

    @Override
    public void name() {
        // TODO Auto-generated method stub
        PbInterface.super.name();
        System.out.println("Imp Hello");
    }

    // @Override
    // public void test() {
    // // TODO Auto-generated method stub

    // }

    public int test1() {

        System.out.println("From Impl");

        return 0;

    }

    // @Override
    public void singleAbsMethod() {
        // TODO Auto-generated method stub

    }

    // @Override
    // protected void test() {
    // // TODO Auto-generated method stub

    // }

}
