package SingletonDesign;

public class SingletonDesign {

    private static SingletonDesign singletonInstance = new SingletonDesign();

    private SingletonDesign() {
    }

    public static SingletonDesign getInstance() {
        return singletonInstance;

    }

    public void SimpleMethod() {
        System.out.println(singletonInstance);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
