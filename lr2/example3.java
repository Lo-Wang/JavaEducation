package lr2;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = sc.nextLine().toUpperCase();

        System.out.println("Введите ключ (сдвиг):");
        int key = sc.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = sc.next();

        if (response.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        sc.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((ch - 'A' + key) % 26) + 'A');
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key); // Обратное преобразование с ключом 26 - key
    }
}
