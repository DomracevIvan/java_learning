package HomeWork.Lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arrows {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символы: ");
        String input = sc.nextLine();

        String arrows = ">>-->|<--<<";
        Pattern pattern = Pattern.compile(arrows);
        Matcher matcher = pattern.matcher(input);

        int counter = 0;
        while (matcher.find()) {
            counter++;

        }
        System.out.println("Количество стрел: " + counter);


    }
}
