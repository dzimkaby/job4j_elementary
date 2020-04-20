package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double ostatok = amount;
                while (ostatok > 0) {
             ostatok = ((amount+(percent/100)*amount) - salary);
            year = year + 1;
           amount = ostatok;

        }
        return year;
    }
    public static void main(String[] args) {
        System.out.println("Количество лет для выплаты кредита равно " + Mortgage.year(100, 70, 50));
    }

}
