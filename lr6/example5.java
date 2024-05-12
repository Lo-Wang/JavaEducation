package lr6;

import java.util.concurrent.*;

public class example5{

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
            results[i] = executor.submit(new MaxElementTask(array, start, end));
        }

        // Получаем результаты и находим максимальный элемент
        int max = Integer.MIN_VALUE;
        try {
            for (Future<Integer> result : results) {
                max = Math.max(max, result.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Выводим результат
        System.out.println("Наибольший элемент в массиве: " + max);

        // Останавливаем пул потоков
        executor.shutdown();
    }

    // Задача для поиска максимального элемента в части массива
    static class MaxElementTask implements Callable<Integer> {
        private int[] array;
        private int start;
        private int end;

        public MaxElementTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() {
            int max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                max = Math.max(max, array[i]);
            }
            return max;
        }
    }
}
