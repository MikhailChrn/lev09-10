public class Solution04 {
    //lev09: Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:

    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getClass().getSimpleName());
            System.out.println(ex.getMessage());
        }
        //напишите тут ваш код
    }
}

