package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if ((ab + ac > bc)&&(ab + bc > ac)&&(bc + ac > ab)) {
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольника не существует");
        }
        return true;
    }
    public static void main(String[] Args) {
        Triangle.exist(2, 2, 2);
        Triangle.exist(0, 1, 2);
        Triangle.exist(3, 4, 5);
        Triangle.exist(6.5,6.5, 5);
    }
        }


