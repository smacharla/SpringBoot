package executable;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> Cube = i -> i * i * i;
        System.out.println(Cube.apply(2));

        Function<Integer, Integer> twice = i -> i * 2;
        System.out.println(twice.apply(2));

        Function<Integer, Integer> fours = i -> i * i * i * i;
        System.out.println(fours.apply(2));

        System.out.println("And then-->" + twice.andThen(Cube).apply(2));

        System.out.println("And compose-->" + twice.compose(Cube).apply(2));

        System.out.println("Mutliple chain-->" + twice.andThen(Cube).andThen(fours).apply(2));

        System.out.println("Mutliple Compose-->" + twice.compose(Cube).compose(fours).apply(2));

        FunctionDemo fd = new FunctionDemo();
        System.out.println("---------->" + fd.square(10));

    }

    public int square(int i) {

        return i * i;

    }

}
