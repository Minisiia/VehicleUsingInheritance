package vehicle;

public class Plane extends Vehicle{
    private int height;
    private int amountOfPassengers;

    public Plane() {
    }

    public Plane(int height, int amountOfPassengers) {
        this.height = height;
        this.amountOfPassengers = amountOfPassengers;
    }

    public Plane(int price, int speed, int year, int height, int amountOfPassengers) {
        super(price, speed, year);
        this.height = height;
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", height: " + height + ", amount of passengers: " + amountOfPassengers);
    }
}
