package Lesson4.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово кабанчик");
        String word1 = scanner.nextLine();
        System.out.println("Введите слово волчок");
        String word2 = scanner.nextLine();
        System.out.println("получился:");
        String word3 = "кабанчик";
        String word4 = "волчок";
        System.out.println(word3.substring(0, 4) + word4.substring(3 ,6));


    }
}
