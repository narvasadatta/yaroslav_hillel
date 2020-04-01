package home;

public class Transport {

    private String name;
    private int speed;
    private int numberOfPlaces;
    private int fuelСosts =;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    Transport(String name, int speed, int numberOfPlaces) {
        this.name = name;
        this.speed = speed;
        this.numberOfPlaces = numberOfPlaces;
    }

    public void transports() {
        System.out.println("Выполняется перевозка пассажиров");
    }
}
