package task01module04.task4;

/*
 * Вычислить значение функции
 */

public class Solution {

    public double calculateValueFunction(double x) {
        double result;

        if (x <= 13) {
            result = -Math.pow(x, 3) + 9;
        } else {
            result = -(3 / (x + 1));
        }
        return  result;
    }
}
