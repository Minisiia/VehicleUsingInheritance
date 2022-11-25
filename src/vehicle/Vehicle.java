package vehicle;

public class Vehicle {

    private int price;
    private int speed;
    private int year;

    public Vehicle() {
    }

    public Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void showInfo () {
        System.out.print("Price: " + price + ", speed: " + speed + ", year: " + year);
    }
}
