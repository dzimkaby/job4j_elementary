package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }

        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                System.out.println(number + " - " + "составное число");
                prime = false;
            }
            else {
                System.out.println(number + " - " + "простое число");
            }
            break;
        }
        return prime;
    }
        public static void main (String[] args) {
            System.out.println(CheckPrimeNumber.check(8));
        }
}


