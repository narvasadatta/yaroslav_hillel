package MyHomeWork10;

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Embraer ERJ 145", 700, 37);
        airplane.registrationOpen();
        airplane.transports();
        System.out.print("Название самолета: " + airplane.getName() + ", Средняя скорость: "
                + airplane.getSpeed() + ", Колличество пассажиров: "
                + airplane.getNumberOfPlaces());
        airplane.setAirplaneClass("Бизнес");
        System.out.println(", Класс самолета: " + airplane.getAirplaneClass() + "\n");

        Train train = new Train("Hyundai Rotem ", 140, 579);
        train.landingOpen();
        train.transports();
        System.out.print("Название поезда: " + train.getName() + ", Средняя скорость: "
                + train.getSpeed() + ", Колличество пассажиров: "
                + train.getNumberOfPlaces());
        System.out.println(", Тип поезда: " + train.getTrainClass());
        System.out.println("___________________________");
        normalTime(airplane);
        normalTime(train);

        train.whoIsFaster(airplane);
        System.out.println("___________________________");
        System.out.println("Стоимость билета на поезд: " + train.getTravelCost() + " грн.");
        System.out.println("Стоимость билета на самолет: " + airplane.getTravelCost() + " грн.");
        Transport.whoIsCheaper(airplane, train);
    }

    public static void normalTime(Transport instanse) {
        int min = (int) Math.floor((instanse.totalTravelTime() % 1) * 60);
        int hout = (int) Math.floor(instanse.totalTravelTime());
        System.out.println("Время путешествия на " + instanse.getName() + " займет: " + hout + " ч. " + min + " мин.");
    }
}

