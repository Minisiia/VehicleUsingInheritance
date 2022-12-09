package vehicle;

public class Plane extends Vehicle{
    private int altitude;
    private int amountOfPassengers;

    public Plane() {
    }

    public Plane(int height, int amountOfPassengers) {
        this.altitude = height;
        this.amountOfPassengers = amountOfPassengers;
    }

    public Plane(double latitude, double longitude, int price, int speed, int year, int altitude, int amountOfPassengers) {
        super(latitude, longitude, price, speed, year);
        this.altitude = altitude;
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", altitude: " + altitude + ", amount of passengers: " + amountOfPassengers);
    }
}
