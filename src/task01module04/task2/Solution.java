package task01module04.task2;

/*
 * Вычислите число и месяц в невисокосном году по номеру дня.
 */

public class Solution {

    private short numberDay;
    private boolean flag = true;
    private byte counter = 1;

    public void processingNumberDayToDate(short number) {
        numberDay = number;

        day(31);
        day(28);
        day(31);
        day(30);
        day(31);
        day(30);
        day(31);
        day(31);
        day(30);
        day(31);
        day(30);
        day(31);
    }

    private void day(int countDays) {
        if (numberDay <= countDays && flag) {
            System.out.println(numberDay + " - день, месяц: " + counter);
            flag = false;
        }

        if (numberDay > countDays) {
            numberDay -= countDays;
            counter++;
        }
    }
}
