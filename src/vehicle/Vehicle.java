package vehicle;

public class Vehicle {
    private double latitude;
    private double longitude;
    private int price;
    private int speed;
    private int year;

    public Vehicle() {
    }

    public Vehicle(double latitude, double longitude, int price, int speed, int year) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void showInfo () {
        System.out.print("Latitude: " + latitude + ", longitude: " + longitude + ", price: " + price + ", speed: " + speed + ", year: " + year);
    }
}
