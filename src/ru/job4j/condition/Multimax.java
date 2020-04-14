package ru.job4j.condition;

public class Multimax {
    public static int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        int result2 = result >= third ? result : third;
              return result2;
           }

    public static void main(String [] Args) {
        System.out.println("Максимальное значение из трех будет " + max(1, 2, 5));
        System.out.println("Максимальное значение из трех будет " + max(7, 0, 3));
        System.out.println("Maximum of three numbers is " + max(3, 2, 1));
        System.out.println("Maximum of three numbers is " + max(3, 8, 1));
        System.out.println("Maximum of three numbers is " + max(3, 3, 4));
        System.out.println("Maximum of three numbers is " + max(1, 1, 1));
    }
}
