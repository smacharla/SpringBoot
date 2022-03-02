package SingletonDesign;

public class MainHelp {

    public static void main(String[] args) {
        SingletonDesign sd = SingletonDesign.getInstance();
        sd.SimpleMethod();

        SingletonDesign sd1 = SingletonDesign.getInstance();
        sd1.SimpleMethod();
    }

}
