package lr6;

import java.util.concurrent.*;

public class example6 {

    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 5, 1, 8, 3, 6}; // Пример массива

        int numThreads = Runtime.getRuntime().availableProcessors(); // Получаем количество ядер процессора
        ExecutorService executor = Executors.newFixedThreadPool(numThreads); // Создаем пул потоков

        // Разбиваем массив на части и создаем задачи для каждой части
        int chunkSize = array.length / numThreads;
        Future<Integer>[] results = new Future[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;
            results[i] = executor.submit(new SumTask(array, start, end));
        }

        // Получаем результаты и суммируем их
        int sum = 0;
        try {
            for (Future<Integer> result : results) {
                sum += result.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Выводим результат
        System.out.println("Сумма всех чисел в массиве: " + sum);

        // Останавливаем пул потоков
        executor.shutdown();
    }

    // Задача для подсчета суммы чисел в части массива
    static class SumTask implements Callable<Integer> {
        private int[] array;
        private int start;
        private int end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
}

