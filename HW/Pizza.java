package Lesson4.HW;

public class Pizza {
    public static void main(String[] args) {
        double S1 = Math.PI * (24 / 2) * (24 / 2);
        double S2 = Math.PI * (28 / 2) * (28 / 2);
        double result1 = calories(S1, S2);
    }

        private static double calories(double S1, double S2) throws NullPointerException{

            double result = (S2 - S1) * 40;
            System.out.println("При выборе пиццы диаметром 28см Вы употребите больше на " + result + " калорий.");
            return result;


        }
    }


