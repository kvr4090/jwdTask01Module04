package task01module04.task1;

/*
 * Вычислите значение выражения по формуле
 */

public class Solution {

    public double function_value(int a, int b, int c) {
        double result;
        result = (((b + Math.sqrt(b * b + 4 * a * c)) / (a * 2)) - (Math.pow(a, 3) * c) + (Math.pow(b, -2));
        return result;
    }
}
