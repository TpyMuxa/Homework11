import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printJobSeparator(1);
        taskLeapYear(2023);
        printJobSeparator(2);
        taskInstall(1, 2023);
    }

    public static void printJobSeparator(int taskNumber) {
        System.out.println("Задание " + taskNumber);
    }

    public static void taskLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void taskInstall(int typeOS, int clientDeviceYear) {
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
}