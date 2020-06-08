package task01module04.task2;

/*
 * Вычислите число и месяц в невисокосном году по номеру дня.
 */

public class Solution {

    public String dateByNumberOfDay(int a) {
        String result= "";
        int temp = a;
        String[] month = {"январь", "февраль", "март", "апрель", "май", "июнь",
                            "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < 12;) {
            if ((temp <= days[i])) {
                result = temp + " " + month[i];
                return result;
            } else {
                temp = temp - days[i];
                i++;
            }
        }
        return result;
    }
    
    public void dateByNumberDay(int a) {
        int temp = a;

        switch (temp / a) {
            case 1:
                if (temp <= 31) {
                    System.out.println(temp + ".01");
                    break;
                }
                temp -= 31;
            case 2:
                if (temp <= 28) {
                    System.out.println(temp + ".02");
                    break;
                }
                temp -= 28;
            case 3:
                if (temp <= 31) {
                    System.out.println(temp + ".03");
                    break;
                }
                temp -= 31;
            case 4:
                if (temp <= 30) {
                    System.out.println(temp + ".04");
                    break;
                }
                temp -= 30;
            case 5:
                if (temp <= 31) {
                    System.out.println(temp + ".05");
                    break;
                }
                temp -= 31;
            case 6:
                if (temp <= 30) {
                    System.out.println(temp + ".06");
                    break;
                }
                temp -= 30;
            case 7:
                if (temp <= 31) {
                    System.out.println(temp + ".07");
                    break;
                }
                temp -= 31;
            case 8:
                if (temp <= 31) {
                    System.out.println(temp + ".08");
                    break;
                }
                temp -= 31;
            case 9:
                if (temp <= 30) {
                    System.out.println(temp + ".09");
                    break;
                }
                temp -= 30;
            case 10:
                if (temp <= 31) {
                    System.out.println(temp + ".10");
                    break;
                }
                temp -= 31;
            case 11:
                if (temp <= 30) {
                    System.out.println(temp + ".11");
                    break;
                }
                temp -= 30;
            case 12:
                System.out.println(temp + ".12");
        }
}

