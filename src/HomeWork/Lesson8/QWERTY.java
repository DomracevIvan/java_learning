package HomeWork.Lesson8;

import java.util.Scanner;

public class QWERTY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите букву: ");
        char ch = sc.next().charAt(0);

        String alfabet = "qwertyuiopasdfghjklzxcvbnm";

        for (int i = 0; i < alfabet.length(); i++) {
            if (ch == alfabet.charAt(i)) {
                int leftIndex = (i - 1 + alfabet.length()) % alfabet.length();
                System.out.println("Слева на клавиатуре буква: " + alfabet.charAt(leftIndex));
            }
        }
    }
}