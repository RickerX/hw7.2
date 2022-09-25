import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        int year = 2023;
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if ((year100 == 0 || year4 != 0) && year400 != 0) {
            System.out.println(year + " - не високосный год.");
        } else {
            System.out.println(year + " - високосный год.");
        }
    }
    public static void task2 () {
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }

    }
    public static void task3 () {
        int deliveryDistance = 95;
        int oneDay = 1;
        int twoDays = 2;
        int threeDays = 3;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:"+oneDay);
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:"+twoDays);
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:"+threeDays);
        }
    }
}