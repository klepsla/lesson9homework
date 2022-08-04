import java.sql.SQLOutput;
import java.time.LocalDate;

class Homework {
    //Задание № 1
    public static boolean LeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
    //Задание № 2
    private static void getOS (int clientOS, int clientDeviceYear) {
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
    private static int deliveryDays (int limitation, int stepDistance, int deliveryDistance ) {
        int numberDays = 0;
        if (deliveryDistance > limitation) {
            numberDays += ((deliveryDistance - limitation) / stepDistance);
            if ((deliveryDistance - limitation) % stepDistance > 0) {
                numberDays++;
            }
        }
        return numberDays;
    }
    public static void main(String[] args) {
        //к заданию № 1
        int year = 2020;
        if (LeapYear(year)) {
            System.out.println(year + " - это високосный год.");
        } else {
            System.out.println(year + " - это не високосный год.");
        }
        //к заданию № 2
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear(); {
            System.out.println("Сейчас - " + clientDeviceYear + " год ");
            getOS (clientOS, clientDeviceYear);
        }
        //к заданию № 3
        int deliveryDistance = 95;
        int limitation = 20;
        int stepDistance = 40;
        int numberDays = 1;
        numberDays += deliveryDays (limitation, stepDistance, deliveryDistance);
        System.out.println("Потребуется дней: " + numberDays + ".");
    }
}


