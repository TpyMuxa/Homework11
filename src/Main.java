import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printTaskSeparator(1);
        int year = LocalDate.now().getYear();
        printIsLeapYearOrNot(year);
        printTaskSeparator(2);
        printSuggestionForInstallation(1, 2023);
        printTaskSeparator(3);
        System.out.println("Срок доставки: " + calculateDeliveryDays(25) + " дней");
    }

    public static void printTaskSeparator(int taskNumber) {
        System.out.println("Задание " + taskNumber);
    }

    public static void printIsLeapYearOrNot(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printSuggestionForInstallation(int typeOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean oldVersion = clientDeviceYear < currentYear;
        switch (typeOS) {
            case 0:
                if (oldVersion) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (oldVersion) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Приложение банка работает только на iOS или Android");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100 || deliveryDistance == 0) {
            throw new RuntimeException("distance limit or incorrect value");
        } else {
            if (deliveryDistance >= 20) {
                deliveryTime++;
            }
            if (deliveryDistance >= 60) {
                deliveryTime++;
            }
        }
        return deliveryTime;
    }
}