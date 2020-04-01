package home;

public class Train extends Transport {

    private String trainClass;

    public String getTrainClass() {
        return trainClass;
    }

    Train(String name, int speed, int numberOfPlaces) {
        super(name, speed, numberOfPlaces);
        this.trainClass = "Пассажирский";
    }

    public void landingOpen() {
        System.out.println("Внимание! посадка на поезд началась");

    }
}
