package task01module04.task7;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 * Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.
 */

public class Solution {

    public void swapDigits(double r) {
        System.out.println((double) (fractionalNumber(r) * 1000 + wholeNumber(r)) / 1000);
    }

    private int wholeNumber(double a) {
        return (int) a;
    }

    private int fractionalNumber(double a) {
        return (int) (a * 1000) % 1000;
    }
}
