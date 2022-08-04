import java.sql.SQLOutput;

class Homework {
        //Задание № 1
    public static boolean LeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
        }

        //Задание № 2


        public static void main (String[]args){
            int year = 2020;
            if (LeapYear(year)) {
                System.out.println(year + " - это високосный год.");
            } else {
                System.out.println(year + " - это не високосный год.");
            }


        }
    }


