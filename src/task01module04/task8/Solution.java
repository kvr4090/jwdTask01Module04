package task01module04.task8;

/*
 * Вычислить значения функции на отрезке [a,b] c шагом h
 */

public class Solution {

    public void functionValue(int a, int b, int h, int c) {
        int result;

        for (int x = a; x <= b ; x += h ) {
            
            if (x == 15) {
                result = (x + c) * 2;
            } else {
                result = (x - c) + 6;
            }
            System.out.println(result);
        }
    }
}
