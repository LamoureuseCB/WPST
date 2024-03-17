package scooterRent;

public class Scooter {
    int availableScooters;
    int scootersInUse;
    int defaultPrice = 29;
    int additionalPrice = 5;
    Scooter(int inputAvailableScooters, int inputScootersInUse) {
        availableScooters = inputAvailableScooters;
        scootersInUse = inputScootersInUse;
    }

    void getPrice() {
        if(availableScooters == 0) {
            System.out.println("Нет доступных самокатов.");
        } else {
            int currentPrice = ((scootersInUse + 1)/availableScooters) * additionalPrice + defaultPrice;
            System.out.println("Текущая стоимость проката: " + currentPrice + " тг/мин");
        }
    }

    void rentScooter() {
        if (availableScooters == 0) {
            System.out.println("Доступных самокатов не осталось.");
        } else {
            int currentPrice = ((scootersInUse + 1)/availableScooters) * additionalPrice + defaultPrice;
            scootersInUse++;
            availableScooters--;
            System.out.println("Выдайте самокат по цене " + currentPrice + " тг/мин");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }

    void returnScooter() {
        if(scootersInUse == 0) {
            System.out.println("Все самокаты уже возвращены.");
        } else {
            scootersInUse--;
            availableScooters++;
            System.out.println("Самокат принят.");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }
}
