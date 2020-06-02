package task01module04.task5;

/*
 * Дано трехзначное число. Определите:
 *   сумму и произведение цифр числа;
 *   число, полученное перестановкой цифр сотен и десятков;
 *   четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч (например, из числа 137 необходимо получить число 7137).
 * Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.
 */

public class Solution {

    public int[] transformationNumber(int a) {
        int h = splitNumberToDigit(a)[0];
        int d = splitNumberToDigit(a)[1];
        int c = splitNumberToDigit(a)[2];
        return new int[] {sumNumbers(h, d, c), multiplicationNumbers(h, d, c), shiftDigits(h, d, c), addDigit(a)};
    }

    private int sumNumbers(int a, int b, int c) {
        return a + b + c;
    }

    private int multiplicationNumbers(int a, int b, int c) {
        return a * b * c;
    }

    private int[] splitNumberToDigit(int a) {
        return new int[] {(a / 100) % 10, (a / 10) % 10, a % 10};
    }

    private int shiftDigits(int hundred, int dozen, int c) {
        return c + 100 * dozen + 10 * hundred;
    }

    private int addDigit(int a) {
        return (a % 10) * 1000 + a;
    }
}
