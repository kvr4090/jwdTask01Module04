package task01module04.task2;

/*
 * Вычислите число и месяц в невисокосном году по номеру дня.
 */

public class Solution {

    private short numberDay;
    private boolean flag = true;
    private byte month = 1;

    public void processingNumberDayToDate(short number) {
        numberDay = number;

        day((short) 31);
        day((short) 28);
        day((short) 31);
        day((short) 30);
        day((short) 31);
        day((short) 30);
        day((short) 31);
        day((short) 31);
        day((short) 30);
        day((short) 31);
        day((short) 30);
        day((short) 31);
    }

    private void day(short countDays) {
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
