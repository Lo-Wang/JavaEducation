package lr6;

import java.util.Date;

public class example1 {
    public static void main(String[] args) {
        // Создаем и запускаем первый поток
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        // Создаем и запускаем второй поток
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }

    // Реализация интерфейса Runnable для потоков
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Получаем текущее имя потока
            String threadName = Thread.currentThread().getName();

            // Выводим имя потока и текущее время в течение 10 секунд
            long endTime = System.currentTimeMillis() + 10000; // Текущее время + 10 секунд
            while (System.currentTimeMillis() < endTime) {
                System.out.println("Поток: " + threadName + ", Время: " + new Date());
                try {
                    Thread.sleep(1000); // Приостанавливаем поток на 1 секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
