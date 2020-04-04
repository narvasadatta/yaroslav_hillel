package MyHomeWork10;

public class Airplane extends Transport {

    private String airplaneClass;
    private int fuelTankVolume = 2500;      // Одной заправки хватает на 2500 км полета
    private int countOfFuelingStops;
    private final int STOPTIME = 6;         // в среднем на заправку и подготовку самолета уходит 6 часов (360 минут)
    private double fuelCosts = 3.0;         // грн. за 1км. в пересчете на одного пассажира
    private double travelCost = findCost();

    public double getTravelCost() {
        return travelCost;
    }

    @Override
    public void setTotalDowntime(double totalDowntime) {
        super.setTotalDowntime(totalDowntime);
    }

    public double getFuelCosts() {
        return fuelCosts;
    }

    public String getAirplaneClass() {
        return airplaneClass;
    }

    public void setAirplaneClass(String airplaneClass) {
        this.airplaneClass = airplaneClass;
    }

    Airplane(String name, int speed, int numberOfPlaces) {
        super(name, speed, numberOfPlaces);

        if (Transport.distance <= fuelTankVolume) {
            setTotalDowntime(0);

        } else {
            countOfFuelingStops = Transport.distance / fuelTankVolume;
            setTotalDowntime(STOPTIME * countOfFuelingStops);
        }
    }

    public void registrationOpen() {
        System.out.println("Пройдите на регистрацию");
    }

    @Override
    public void transports() {
        System.out.println("Выполняется авиаперелет пассажиров");
    }

    public double findCost() {
        return distance * fuelCosts;
    }

}

