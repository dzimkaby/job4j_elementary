package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int i=0;
        for (int index = word.length - post.length; index < word.length; index++) {
            if (word[index] != post[i]) {
                    result = false;
                    break;
                }
            i=i+1;
                            }

        return result;
    }

        public static void main (String[] args) {
            char[] word = new char[]{'р', 'а', 'д', 'о', 'с', 'т', 'ь'};
            char[] post = new char[]{'д', 'о', 'с', 'т', 'ь'};
            boolean res = EndsWith.endsWith(word, post);
            System.out.println(res);
        }
    }


