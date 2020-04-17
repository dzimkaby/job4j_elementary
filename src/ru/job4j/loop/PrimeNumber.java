package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        System.out.println(finish + " - " + "верхняя граница диапазона");
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int quantity = PrimeNumber.calc(20);
        System.out.println(quantity + " - " + "количество простых чисел в заданном диапазоне");
    }

}
