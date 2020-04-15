package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second) {
            result = second;
        }
        if (second <= third) {
            result = third;
        }
        return result;
    }
    public static void main(String[] Args) {
        System.out.println(ThreeMax.max(1, 2, 3));
        System.out.println(ThreeMax.max(2, 1, 0));
        System.out.println(ThreeMax.max(4, 7, 3));

    }
}
