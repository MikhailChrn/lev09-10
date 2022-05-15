import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution14_2 {
    //Решение №2
    //lev:10 Введи с клавиатуры 10 строчек и посчитай в них количество различных букв
    // без учета регистра. Результат выведи на экран в алфавитном порядке.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        for (Character x : alphabet) {
            int count = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i)==x) count++;
                }
            }
            System.out.println(x + " " + count);
        }
        // напишите тут ваш код
    }
}

