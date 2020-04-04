package MyHomeWork10;

public class Transport {

    static int distance = 6600;             // км.
    private String name;
    private int speed;                      // км./час
    private int numberOfPlaces;
    private double totalDowntime;

    public void setTotalDowntime(double totalDowntime) {
        this.totalDowntime = totalDowntime;
    }

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

    public double travelTime() {
        return (double) distance / this.speed;
    }

    public double totalTravelTime() {
        return travelTime() + totalDowntime;
    }

    public void whoIsFaster(Transport instanse) {
        if (this.totalTravelTime() < instanse.totalTravelTime()) {
            System.out.println("Добираться на " + this.getName() + " быстрее");

        } else if (this.totalTravelTime() > instanse.totalTravelTime()) {
            System.out.println("Добираться на " + instanse.getName() + " быстрее");
        } else {
            System.out.println("Время проведенное в пути на " + this.getName() + " и " + instanse.getName() + " равно");
        }
    }

    public static void whoIsCheaper(Airplane airplane, Train train) {
        if (train.getTravelCost() < airplane.getTravelCost()) {
            System.out.println("Добираться поездом дешевле");

        } else if (train.getTravelCost() > airplane.getTravelCost()) {
            System.out.println("Добираться самолетом дешевле");

        } else {
            System.out.println("Стоимость билета на самолет такая же как и на поезд");
        }
    }
}


