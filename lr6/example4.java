package lr6;

public class example4 {

    public static void main(String[] args) {
        // Создаем и запускаем 10 потоков
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
        }
    }

    // Поток для вывода своего номера
    static class NumberPrinter implements Runnable {
        private int number;

        public NumberPrinter(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Поток " + number + " запущен.");
        }
    }
}

