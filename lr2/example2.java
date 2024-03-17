package lr2;

public class example2 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] snakeArray = new int[rows][cols];
        int value = 1;

        // заполняем массив
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    snakeArray[i][j] = value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    snakeArray[i][j] = value++;
                }
            }
        }

        // выводим массив 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
