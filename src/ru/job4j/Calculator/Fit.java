package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height-100)*1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height-110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(176);
        double woman = Fit.womanWeight(173);
        System.out.println("A man with height = 176 must weigh  " + man);
        System.out.println("A woman with height = 173 must weigh  " + woman);
    }

}
