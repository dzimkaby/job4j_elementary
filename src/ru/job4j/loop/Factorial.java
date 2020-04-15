package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        if (n==0) {
            result = 1;
        }
        for (int index = 1; index <= n; index++) {
            result = result*index;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial.calc(2));
        System.out.println(Factorial.calc(3));
        System.out.println(Factorial.calc(4));
        System.out.println(Factorial.calc(0));
    }
}
