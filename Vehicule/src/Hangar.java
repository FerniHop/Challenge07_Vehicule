// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Clio", 50000);
        Boat boat = new Boat("Titanic", 1000000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}