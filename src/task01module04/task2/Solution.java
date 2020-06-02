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
}

