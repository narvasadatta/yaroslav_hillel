package home;

public class Airplane extends Transport {

    private String airplaneClass;
    private int fuelTankVolume = ;

    public String getAirplaneClass() {
        return airplaneClass;
    }

    public void setAirplaneClass(String airplaneClass) {
        this.airplaneClass = airplaneClass;
    }

    Airplane(String name, int speed, int numberOfPlaces) {
        super(name, speed, numberOfPlaces);
    }

    public void registrationOpen() {
        System.out.println("Пройдите на регистрацию");
    }

    @Override
    public void transports() {
        System.out.println("Выполняется авиаперелет пассажиров");
    }
}