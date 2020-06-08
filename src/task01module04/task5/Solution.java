package task01module04.task5;

/*
 * Дано трехзначное число. Определите:
 *   сумму и произведение цифр числа;
 *   число, полученное перестановкой цифр сотен и десятков;
 *   четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч 
 *   (например, из числа 137 необходимо получить число 7137).
 * Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.
 */

public class Solution {

    private int number;
    private int hundred;
    private int dozen;
    private int entity;

    public Solution(int number) {
        this.number = number;
    }

    public int[] getResultTransformationNumber() {
        addValues();
        return new int[] {sumNumbers(), multiplicationNumbers(), shiftDigits(), concatenationDigit()};
    }

    private void addValues() {
        hundred = (number / 100) % 10;
        dozen = (number / 10) % 10;
        entity = number % 10;
    }

    private int sumNumbers() {
        return hundred + dozen + entity;
    }

    private int multiplicationNumbers() {
        return hundred * dozen * entity;
    }

    private int shiftDigits() {
        return entity + 100 * dozen + 10 * hundred;
    }

    private int concatenationDigit() {
        return (number % 10) * 1000 + number;
    }
}
