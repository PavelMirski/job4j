package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int x = word.length - post.length;
        for(int i = post.length-1; i >= 0; i--){

            if (post[i] != word[i+x]) {
                result = false;
                break;
            }
            result = true;
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}