package task01module04.task10;

/*
 * Напишите программу, которая для введенной последовательности целых ненулевых чисел
 * (признак окончания ввода - ввод 0, количество чисел не меньше 2) определяет:
 * является ли последовательность возрастающей;
 * есть ли в ней хотя бы одна пара одинаковых соседних чисел;
 * является ли последовательность знакочередующейся (3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет);
 * Для ввода значений с клавиатуры можно воспользваться классом Scanner.
 * Примечание: массив или коллекцию для решения этой задачи использовать нельзя.
 */

import java.util.Scanner;

public class Solution {

    private boolean flagIncrease = true;
    private boolean flagTwins = false;
    private boolean flagRotation = true;

    public void getResult() {
        fillSequence();
        processingSequence();
    }

    private void fillSequence() {
        int previousValue;
        int currentValue;
        Scanner scanner = new Scanner(System.in);
        previousValue = scanner.nextInt();

        while (true) {
            currentValue = scanner.nextInt();

            if (currentValue == 0) {
                break;
            }

            if (currentValue < previousValue) {
                flagIncrease = false;
            }

            if (currentValue == previousValue) {
                flagTwins = true;
                flagIncrease = false;
            }

            if (((currentValue > 0) && (previousValue > 0)) || ((currentValue < 0) && (previousValue < 0))) {
                flagRotation = false;
            }
            previousValue = currentValue;
        }
        scanner.close();
    }

    private void processingSequence() {
        if (flagIncrease) {
            System.out.println("последовательность возрастающая");
        }

        if (flagTwins) {
            System.out.println("одна пара одинаковых соседних чисел");
        }

        if (flagRotation) {
            System.out.println("последовательность знакочередующаяся");
        } else {
            System.out.println("последовательность НЕ знакочередующаяся");
        }
    }
}
