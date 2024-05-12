package lr6;

public class example2 {
    public static void main(String[] args) {
        // Создаем и запускаем поток
        Thread numberThread = new Thread(new NumberPrinter());
        numberThread.start();
    }

    // Реализация интерфейса Runnable для потока
    static class NumberPrinter implements Runnable {
        @Override
        public void run() {
            // Выводим числа от 1 до 10 с задержкой в 1 секунду между выводами
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // Приостанавливаем поток на 1 секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

