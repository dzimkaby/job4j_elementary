package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String login = "root";
        boolean userHasAccess = StringEq.check(login);
        System.out.println(userHasAccess);
    }
}
