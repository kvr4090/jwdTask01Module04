package task01module04.task6;

/*
 * Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2.
 * Даны a1 и d (шаг арифметической прогрессии). Найдите n, при котором значение Sn выходит
 * за диапазон типов int и long (экспериментальным путем).
 */

public class Solution {
    
    public void findValueForInt(int a, int d) {
        long temp;
        int counter = 2;

        while(true) {
            temp = (a + (a + d * (counter - 1L))) * counter / 2;

            if (Math.abs(temp) > Integer.MAX_VALUE) {
                System.out.println(counter);
                break;
            } else {
                counter++;
            }
        }
    }

    public void findValueForLong(int a, int d) {
        float temp;
        long counter = 2;

        while (true) {
            temp = (a + (a + d * (counter - 1f))) * counter / 2;

            if (Math.abs(temp) > Long.MAX_VALUE) {
                System.out.println(counter);
                break;
            } else {
                counter++;
            }
        }
    }
}
