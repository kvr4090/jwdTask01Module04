package task01module04.task9;

/*
 * Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
 */

public class Solution {

    public void calculationValue() {
        int temp = 1;
        float result = 1;

        for (int i = 2; i <= 10; i++) {
            temp += i;
            result *= temp;
        }
        System.out.println(result);
    }
}
