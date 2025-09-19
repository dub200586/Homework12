package Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String string = sc.nextLine();

        Pattern docNumberPattern = Pattern.compile("[\\d]{4}-[\\d]{4}-[\\d]{2}");
        Pattern phoneNumberPattern = Pattern.compile("\\([\\d]{2}\\)[\\d]{7}");
        Pattern emailPattern = Pattern.compile("[A-z\\d+_.-]+@[A-z\\d.-]+\\.[A-z]{2,}");

        Matcher docNumber = docNumberPattern.matcher(string);
        Matcher phoneNumber = phoneNumberPattern.matcher(string);
        Matcher email = emailPattern.matcher(string);

        if (docNumber.find()) {
            System.out.println("Document number: " + docNumber.group());
        }
        if (phoneNumber.find()) {
            System.out.println("Phone number: " + phoneNumber.group());
        }
        if (email.find()) {
            System.out.println("Email: " + email.group());
        }

        sc.close();
    }
}
