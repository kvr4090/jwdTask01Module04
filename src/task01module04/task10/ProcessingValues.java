package task01module04.task10;

public class ProcessingValues {
    boolean a;
    boolean b;
    boolean c;

    public ProcessingValues(boolean a, boolean b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void processing() {
        if (a) {
            System.out.println("последовательность возрастающая");
        }

        if (b) {
            System.out.println("одна пара одинаковых соседних чисел");
        }

        if (c) {
            System.out.println("последовательность знакочередующаяся");
        } else {
            System.out.println("последовательность НЕ знакочередующаяся");
        }
    }
}
