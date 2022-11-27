package class_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));

        System.out.println("\n---Print Each Car---");
        for (Car car : cars) {
            System.out.println(car);
        }


        /*
        Find the most expensive car
        Count How many cars are black -> 2
         */

        System.out.println("\n---Find the most expensive car---");
        Car mostExpensiveCar = cars.get(0);

        for (Car car : cars) {
            if(car.price > mostExpensiveCar.price) mostExpensiveCar = car;
        }
        System.out.println(mostExpensiveCar);


        System.out.println("\n---Count Black Cars---");

        int countBlackCars = 0;

        for (Car car : cars) {
            if(car.color.equals("Black")) countBlackCars++;
        }
        System.out.println(countBlackCars);


        /*
        Count all the cars that are blue or beige or 2023 -> 3
         */

        System.out.println("\n---Count Blue Beige and 2023---");
        int countBB2023 = 0;

        for (Car car : cars) {
            if(car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023) countBB2023++;
        }
        System.out.println(countBB2023);


        /*
        Remove all the cars that are Tesla and print the size of the cars -> 3
         */

        System.out.println("\n---Remove all Tesla and Print the size of cars---");

        /*
        Iterator<Car> iterator = cars.iterator();

        while(iterator.hasNext()){
            if(iterator.next().make.equals("Tesla")) iterator.remove();
        }

        System.out.println(cars.size());

         */

        cars.removeIf(car -> car.make.equals("Tesla"));
        System.out.println(cars.size());
    }
}