package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
         for (int index = 0; index < data.length; index++) {
             if (data[index] != data[0]) {
                 result = false;
             }
                            }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = new boolean[] {false, false, false, false};
        boolean res = Check.mono(data);
        System.out.println(res);

        }

    }