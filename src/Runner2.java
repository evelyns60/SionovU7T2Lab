import java.util.ArrayList;
import java.util.Arrays;

public class Runner2 {
    public static void main (String[] args) {
        Integer[] intsArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car[] carArray = {new Car("Tesla", 2000), new Car("Honda", 1500), new Car( "Mercedes", 2400)};
        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList);
    }
}
