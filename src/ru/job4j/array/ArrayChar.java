package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[] word = new char[] {'п', 'р', 'е' ,'в', 'е', 'т'};
        char[] pref = new char[] {'п', 'р', 'и' };
        boolean res = ArrayChar.startsWith(word, pref);
        System.out.println(res);
    }
}
