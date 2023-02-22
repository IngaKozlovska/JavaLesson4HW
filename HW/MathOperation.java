package Lesson4.HW;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        int sumResult = addTwoNumbers(number1, number2);
        int subResult = subTwoNumbers(number1, number2);
        int mulResult = mulTwoNumbers(number1, number2);
        int divResult = divTwoNumber(number1, number2);

    }
        private static int  addTwoNumbers(int number1,int number2) throws NullPointerException {

            int result = number1 + number2;
            System.out.println("Сумма чисел равна " + result);
            return result;


        }
private static int subTwoNumbers(int number1, int number2) throws NullPointerException{

        int result = number1 - number2;
    System.out.println("Разность чисел равна " + result);
    return result;

        }

        private static int mulTwoNumbers(int number1, int number2) throws NullPointerException{
        int result = number1 * number2;
            System.out.println("Произведение чисел равно " + result);
            return result;

        }
private static int divTwoNumber(int number1, int number2) throws NullPointerException{
        int result = number1 / number2;
    System.out.println("Частное чисел равно " + result);
    return result;

}



}
