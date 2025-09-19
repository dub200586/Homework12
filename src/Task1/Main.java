package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = sc.nextLine();
        String[] words = string.replaceAll("[^A-zА-я ]", "")
                .replaceAll(" +", " ").split(" ");
        int firstWord = 0;

        for (String word : words) {
            if (word.matches("[A-ZА-Я]+") && word.length() >= 2 && word.length() <= 6) {
                firstWord++;
                if (firstWord == 1) {
                    System.out.println("Аббревиатуры:");
                }
                System.out.println(word);
            }
        }
    }
}
