import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution16 {
    //lev10: Создай список целых чисел и введи с клавиатуры 20 значений.
    //Создай метод по безопасному извлечению чисел из списка

    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            //int number = Integer.parseInt(reader.readLine());
            //list.add(number);
            list.add(i);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        //напишите тут ваш код
        int n =  0;
        try {
            n = list.get(index);
        } catch (Exception ex) {
            System.out.println(ex);
            n = defaultValue;
        }
        return n;
    }
}

