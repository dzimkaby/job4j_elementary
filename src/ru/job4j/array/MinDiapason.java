package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index < finish+1; index++) {
            if (array[index] < min) {
                min = array[index];
            }

        }
        return min;
    }
    public static void main(String[] args) {
        int result = MinDiapason.findMin(new int[] {1,4,2,9,7,0,3,8,10}, 0,5);
        System.out.println(result);
    }
}
