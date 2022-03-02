package SingletonDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            FileNotFoundException, IOException, CloneNotSupportedException {
        SingletonLazy oriSingletonLazy = SingletonLazy.getInstance();
        SingletonLazy duplicateSingletonLazy = SingletonLazy.getInstance();

        System.out.println("oriSingletonLazy HashCOde  " + oriSingletonLazy.hashCode());
        System.out.println("duplicateSingletonLazy HashCOde  " + duplicateSingletonLazy.hashCode());

        // Reflection

        Class<?> singleton = Class.forName("SingletonDesign.SingletonLazy");
        Constructor<SingletonLazy> constructor = (Constructor<SingletonLazy>) singleton.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println("oriSingletonLazy HashCOde  " + oriSingletonLazy.hashCode());
        System.out.println(constructor.newInstance().hashCode());
        System.out.println("oriSingletonLazy HashCOde  " + oriSingletonLazy.hashCode());

        // Serialization

        System.out.println("-------------------");
        System.out.println("Breaking using Streams");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("D:\\SpringBoot\\Java\\Serialization.ser"));

        objectOutputStream.writeObject(oriSingletonLazy);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("D:\\SpringBoot\\Java\\Serialization.ser"));

        SingletonLazy brokeSingletonLazySerialazion = (SingletonLazy) objectInputStream.readObject();

        System.out.println("oriSingletonLazy HashCOde  " + oriSingletonLazy.hashCode());
        // System.out.println(constructor.newInstance().hashCode());
        System.out.println("brokeSingletonLazySerialazion HashCOde  " + brokeSingletonLazySerialazion.hashCode());

        // Cloning
        System.out.println("----------------------------");
        System.out.println("Breaking using Cloning");

        SingletonLazy brokeSingletonLazyUsingCloningIns = (SingletonLazy) oriSingletonLazy.clone();

        System.out.println("oriSingletonLazy HashCOde  " + oriSingletonLazy.hashCode());
        // System.out.println(constructor.newInstance().hashCode());
        System.out.println("brokeSingletonLazySerialazion HashCOde  " + brokeSingletonLazyUsingCloningIns.hashCode());

    }
}
