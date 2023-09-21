public class Main {
    public static void main(String[] args) {
        printJobSeparator(1);
        taskLeapYear(2023);
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
}