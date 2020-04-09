package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, Умник";
        } else if ("Пока.".equals(question)) {
            rsl = "Пока, Умник";

        }
        return rsl;
    }

    public static void main(String[] Args) {
        String rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}

