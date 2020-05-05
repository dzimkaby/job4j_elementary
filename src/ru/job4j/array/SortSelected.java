package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int start = 0;
        for (int index = start; index < data.length; index++) {
            int min = MinDiapason.findMin(data, start, data.length);
            int index2 = FindLoop.indexOf(data, min, start, data.length);
            if (min != data[start]) {
                int temp = data[start];
                data[start] = data[index2];
                data[index2] = temp;
            }
            start++;
        }

        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[]{5, 8, 9, 3, 1};
        int[] result = SortSelected.sort(data);
        System.out.println();
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}
