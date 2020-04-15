package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum1 = 0;
        for (int index = start; index <= finish; index++) {
            sum1 = sum1 + index;
        }
        return sum1;
    }

    public static int sumByEven(int start, int finish) {
        int sum2 = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum2 = sum2 + index;
            }
        }
        return sum2;
    }

        public static void main(String[] args) {
            System.out.println(sum(0, 10));
            System.out.println(sum(3, 8));
            System.out.println(sum(1, 1));

            System.out.println(sumByEven(0, 10));
            System.out.println(sumByEven(3, 8));
            System.out.println(sumByEven(1, 1));
        }
    }
