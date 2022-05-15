import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution13 {
    //lev09: Задача: Пользователь вводит с клавиатуры список слов (и чисел).
    //Слова вывести в возрастающем порядке, числа - в убывающем.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] word) {
        // напишите тут ваш код
        ArrayList<Integer> positionOfText = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();
        ArrayList<Integer> positionOfNumb = new ArrayList<>();
        ArrayList<Integer> numb = new ArrayList<>();

        //1.Распускаем исходный массив на 4шт. list-а
        int i = 0;
        for (String str : word) {
            if (isNumber(str) == true) {
                positionOfNumb.add(i); //Номер позиции числа
                numb.add(Integer.parseInt(str)); //Число
            } else {
                positionOfText.add(i); //Номер позиции слова
                text.add(str); //Слово
            }
            i++;
        }
        //2.Пузырьковая сортирвка строк
        String temp;
        for (int out = 0; out < (text.size() - 1); out++) {
            for (int in = (text.size() - 1); in > out; in--) {
                if (isGreaterThan(text.get(in - 1), text.get(in)) == true) {
                    temp = text.get(in);
                    text.set(in, text.get(in - 1));
                    text.set(in - 1, temp);
                }
            }//end for IN
        }//end for OUT
        //3.Пузырьковая сортировка чисел
        Integer tmp;
        for (int out = 0; out < (numb.size() - 1); out++) {
            for (int in = (numb.size() - 1); in > out; in--) {
                if (numb.get(in - 1) < numb.get(in)) {
                    tmp = numb.get(in);
                    numb.set(in, numb.get(in - 1));
                    numb.set(in - 1, tmp);
                }
            }//end for IN
        }//end for OUT
        for (int n = 0; n < positionOfText.size(); n++) word[positionOfText.get(n)] = text.get(n);
        for (int n = 0; n < positionOfNumb.size(); n++) word[positionOfNumb.get(n)] = String.valueOf(numb.get(n));
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}

