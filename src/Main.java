import java.sql.SQLOutput;
import java.time.LocalDate;

class Homework {
    //Задание № 1
    public static boolean definitionLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    //Задание № 2
    private static void definitionOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке...");
        }
    }

    //Задание № 3
    private static int countingDeliveryDays(int distance) {
        if (distance < 20 && distance > 0) {
            return 1;
        } else if (distance < 60 && distance >= 20) {
            return 2;
        } else if (distance < 100 && distance >= 60) {
            return 3;
        } else {
            throw new  RuntimeException("Доставка невозможна.");
        }
    }

        public static void main (String[]args) {
            //к заданию № 1
            System.out.println("Задание № 1.");
            int year = 2020;
            if (definitionLeapYear(year)) {
                System.out.println(year + " - это високосный год.");
            } else
                System.out.println(year + " - это не високосный год.");

            //к заданию № 2
            System.out.println("Задание № 2.");
            int clientOS = 1;
            int clientDeviceYear = LocalDate.now().getYear();
                System.out.println("Сейчас - " + clientDeviceYear + " год ");
                definitionOS(clientOS, clientDeviceYear);
            //к заданию № 3
            System.out.println("Задание № 3.");
            int distance = 500;
            System.out.println("Потребуется дней: " + countingDeliveryDays(distance) + ".");
        }
    }



