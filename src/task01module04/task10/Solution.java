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

    public void sequenceProcessing() {
        int previous;
        int current;
        boolean flagIncrease = true;
        boolean flagTwins = false;
        boolean flagRotation = true;
        Scanner sc = new Scanner(System.in);
        previous = sc.nextInt();

        while (true) {
            current = sc.nextInt();

            if (current == 0) {
                break;
            }

            if (current < previous) {
                flagIncrease = false;
            }

            if (current == previous) {
                flagTwins = true;
                flagIncrease = false;
            }

            if (((current > 0) && (previous > 0)) || ((current < 0) && (previous < 0))) {
                flagRotation = false;
            }
            previous = current;
        }

        sc.close();
        ProcessingValues pv = new ProcessingValues(flagIncrease, flagTwins, flagRotation);
        pv.processing();
    }
}
