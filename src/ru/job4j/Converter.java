package ru.job4j;

/**
 * Данный класс служит для перевода денег из одной валюты в другую
 *  @author Dmitry Mikhailov
 */
public class Converter {
    /**
     * Метод для перевода рулей в евро
     * @param value - сумма в рублях
     * @return rsl - сумма в евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Метод для перевода рулей в долларах
     * @param value - сумма в рублях
     * @return rsl - сумма в долларах
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 dollar. Test result : " + passed2);
    }
}

