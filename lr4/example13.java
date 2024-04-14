package lr4;

public class example13 {
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);
                if (l != 0) {
                    int h = 10 / l;
                    args[l + 1] = "10";
                } else {
                    System.out.println("Массив пуст");
                }
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не существует");
            }
        }
}
