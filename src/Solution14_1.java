import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution14_1 {
    //lev:10 Введи с клавиатуры 10 строчек и посчитай в них количество различных букв
    // без учета регистра. Результат выведи на экран в алфавитном порядке.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит (по заданию)
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        //Алфавит Map для результатов
        Map<Character, Integer> mapAlphabet = new TreeMap<>();
        for (Character ch : alphabet) mapAlphabet.put(ch, 0);

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        int tmp;
        for (String str : list) {
            for (int i = 0; i < str.length(); i++) {
                Character ch = Character.toLowerCase(str.charAt(i));
                tmp = mapAlphabet.get(ch);
                tmp++;
                mapAlphabet.replace(ch, tmp);
            }
        }

        for (Map.Entry<Character, Integer> entry : mapAlphabet.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        // напишите тут ваш код
    }
}
