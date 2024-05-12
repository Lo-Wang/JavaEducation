package lr6;

public class example3 {

    public static void main(String[] args) {
        // Создаем два потока: один для четных чисел, другой для нечетных
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Запускаем потоки
        evenThread.start();
        oddThread.start();
    }

    // Поток для вывода четных чисел
    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    // Поток для вывода нечетных чисел
    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
