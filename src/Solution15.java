import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution15 {
    //lev10: Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
    //Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.
    //Выведи содержимое словаря на экран.
    //В тестах регистр (большая/маленькая буква) влияет на результат.

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String str : list) result.put(str, 0);

        int tmp = 0;
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            for (String str : list) {
                if (str.equals(entry.getKey())) tmp++;
            }
            result.put(entry.getKey(), tmp);
            tmp = 0;
        }
        //напишите тут ваш код
        return result;
    }
}

