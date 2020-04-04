package MyHomeWork10;

public class Train extends Transport {

    private String trainClass;
    private int countOfStops;
    private final double STOPTIME = 0.25;    // предположем что поеезд делает остановку на 15 минут(0,25 ч.) раз на 200 км.
    private double energyCosts = 0.8;        // грн. за 1км. в пересчете на одного пассажира
    private double travelCost = findCost();

    @Override
    public void setTotalDowntime(double totalDowntime) {
        super.setTotalDowntime(totalDowntime);
    }

    public double getTravelCost() {
        return travelCost;
    }

    public String getTrainClass() {
        return trainClass;
    }

    Train(String name, int speed, int numberOfPlaces) {
        super(name, speed, numberOfPlaces);
        this.trainClass = "Пассажирский";

        if (distance <= 200) {
            setTotalDowntime(0);
        } else {
            countOfStops = distance / 200;
            setTotalDowntime(countOfStops * STOPTIME);
        }
    }

    public void landingOpen() {
        System.out.println("Внимание! посадка на поезд началась");
    }

    public double findCost() {
        return distance * energyCosts;
    }
}
