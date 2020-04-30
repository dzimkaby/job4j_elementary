package ru.job4j.array;

public class FindLoop {
        public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
            int result = FindLoop.indexOf(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},6,3, 9);
        System.out.println(result);
    }


}
