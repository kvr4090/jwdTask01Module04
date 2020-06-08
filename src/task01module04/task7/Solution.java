package task01module04.task7;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 * Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.
 */

public class Solution {

    private double number;

    public Solution(double number) {
        this.number = number;
    }

    public double getResult() {
        return swapDigits();
    }

    private double swapDigits() {
        return (fractionalNumber() * 1000d + wholeNumber()) / 1000;
    }

    private int wholeNumber() {
        return (int) number;
    }

    private int fractionalNumber() {
        return (int) (number * 1000) % 1000;
    }
}
