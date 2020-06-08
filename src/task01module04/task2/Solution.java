package task01module04.task2;

/*
 * Вычислите число и месяц в невисокосном году по номеру дня.
 */

public class Solution {

    private short numberDay;
    private boolean flag = true;
    private byte currentMonth = 1;

    public void processingNumberDayToDate(short number) {
        numberDay = number;

        month((short) 31);
        month((short) 28);
        month((short) 31);
        month((short) 30);
        month((short) 31);
        month((short) 30);
        month((short) 31);
        month((short) 31);
        month((short) 30);
        month((short) 31);
        month((short) 30);
        month((short) 31);
    }

    private void month(short countDays) {
        if (numberDay <= countDays && flag) {
            System.out.println(numberDay + " - день, месяц: " + month);
            flag = false;
        }

        if (numberDay > countDays) {
            numberDay -= countDays;
            month++;
        }
    }
}
