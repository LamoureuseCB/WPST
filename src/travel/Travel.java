package travel;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber > 12 || monthNumber < 1) {
                System.out.println("Некорректный номер месяца. Введите ещё раз.");

            } else {
                String season = getSeasonByNumber(monthNumber);

                if (season.equals("Лето")) {
                    System.out.println("Летом лучше остаться в Астане.");
                    break;
                }
            }


            System.out.println("Укажите стоимость прямых билетов из Астаны в Париж:");
            int ticketAstanaParis = scanner.nextInt();
            System.out.println("Укажите стоимость билетов из Астаны в Париж с пересадкой в Лондоне:");
            int ticketAstanaLondonParis = scanner.nextInt();
            System.out.println("У вас есть британская виза?");
            System.out.println("1 - да, виза есть");
            System.out.println("0 - визы нет");
            int britainVisa = scanner.nextInt();


            if ((ticketAstanaLondonParis <= ticketAstanaParis) && britainVisa == 1) {
                System.out.println("Летим через Лондон!");
                break;
            } else {
                System.out.println("Летим напрямую в Париж!");
                break;
            }
        }
    }


    private static String getSeasonByNumber(int monthNumber) {

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "Зима";
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            return "Весна";
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            return "Лето";
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            return "Осень";
        } else {
            return "В году 4 времени года и лишь 12 месяцев";
        }
    }
}