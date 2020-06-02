package task01module04.task3;

/*
 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
 */

public class Solution {

    public double[] changeNumbers(double a, double b, double c) {
        if ((a > b) && (b > c)) {
            return new double[] {a * 2, b * 2, c * 2};
        } else {
            return new double[] {Math.abs(a), Math.abs(b), Math.abs(c)};
        }
    }
}
