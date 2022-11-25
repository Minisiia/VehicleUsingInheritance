package vehicle;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(200000,500,2010,20,189);
        Car car = new Car(30000,200,1990);
        Ship ship = new Ship(100000,300,2020,100,"Odesa");
        System.out.println("Plane Info:");
        plane.showInfo();
        System.out.println("\nCar Info:");
        car.showInfo();
        System.out.println("\nShip Info:");
        ship.showInfo();

    }
}
