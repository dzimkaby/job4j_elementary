package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int label = first >= second ? first : second;
        return label;
    }

    public static void main(String[] args) {
        int msg = Max.max(22,55);
        System.out.println(msg);
    }

}
