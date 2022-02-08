import java.util.ArrayList;
import java.util.Arrays;

public class Runner2 {
    public static void main(String[] args) {

        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Arif", 100);
        Car car2 = new Car("Nikita", 1000);
        Car[] cars = {car1, car2};

        ArrayList<Car> carArrays = new ArrayList<Car>(Arrays.asList(cars));

       System.out.println(carArrays);
    }
}
