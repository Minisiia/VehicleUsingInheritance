package vehicle;

public class Ship extends Vehicle{
    private int amountOfPassengers;
    private String port;

    public Ship() {
    }

    public Ship(int amountOfPassengers, String port) {
        this.amountOfPassengers = amountOfPassengers;
        this.port = port;
    }

    public Ship(int price, int speed, int year, int amountOfPassengers, String port) {
        super(price, speed, year);
        this.amountOfPassengers = amountOfPassengers;
        this.port = port;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", amount of passengers: " + amountOfPassengers + ", port: " + port);
    }
}
