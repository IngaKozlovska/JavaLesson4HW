package Lesson4.HW;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в EUR");
        double money1 = scanner.nextDouble();
        double rate = 1.07;
        double result = trans(money1, rate);
    }


        private static double trans(double money1, double rate) throws NullPointerException {

            double result = money1 * rate;
            System.out.println("Сумма в USD: " + result);
            return result;

        }
}
