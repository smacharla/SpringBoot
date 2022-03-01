package executable;

import java.util.Date;
import java.util.function.Supplier;

import javax.xml.crypto.Data;

public class SupplierDemo {

    public static void main(String[] args) {
        SupplierDemo sDemo = new SupplierDemo();
        System.out.println(sDemo.getDate1());

        Supplier<Date> sd = () -> new Date();
        System.out.println(sd.get());
    }

    public Date getDate1() {

        return new Date();

    }
}
