package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        System.out.println();
        int[] array2 = new int[]{5, 3, 2, 1, 4};
        int temp2 = array2[0];
        array2[0] = array2[3];
        array2[3] = array2[4];
        array2[4] = temp2;
        temp2 = array2[2];
        array2[2] = array2[1];
        array2[1] = temp2;
        for (int index = 0; index < array2.length; index++) {
            System.out.println(array2[index]);
        }
    }
}



