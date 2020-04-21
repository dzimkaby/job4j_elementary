package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Dmitry";
        names[1] = "Natalia";
        names[2] = "Kirill";
        names[3] = "Esenia";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
            int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}

