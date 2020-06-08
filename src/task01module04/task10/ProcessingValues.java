package task01module04.task10;

public class ProcessingValues {
    boolean conditionA;
    boolean conditionB;
    boolean conditionC;

    public ProcessingValues(boolean a, boolean b, boolean c) {
        this.conditionA = a;
        this.conditionB = b;
        this.conditionC = c;
    }

    public void processing() {
        if (conditionA) {
            System.out.println("последовательность возрастающая");
        }

        if (conditionB) {
            System.out.println("одна пара одинаковых соседних чисел");
        }

        if (conditionC) {
            System.out.println("последовательность знакочередующаяся");
        } else {
            System.out.println("последовательность НЕ знакочередующаяся");
        }
    }
}
