import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution10 {
    //lev09: Написать программу, которая вводит с клавиатуры строку текста.
    //Программа должна вывести на экран две строки:
    //1. первая строка содержит только гласные буквы из введённой строки.
    //2. вторая - только согласные буквы и знаки препинания из введённой строки.
    //Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        ArrayList<Character> vowelsChars = new ArrayList<Character>();
        ArrayList<Character> otherChars = new ArrayList<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            if (isVowel(inputString.charAt(i)) == true ) vowelsChars.add(inputString.charAt(i));
            else if (inputString.charAt(i) == ' ') continue;
            else otherChars.add(inputString.charAt(i));
        }
        for (Character ch : vowelsChars) System.out.print(ch + " ");
        System.out.println();
        for (Character ch : otherChars) System.out.print(ch + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

