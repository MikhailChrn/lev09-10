import java.io.FileNotFoundException;
import java.net.URISyntaxException;

//lev09: Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
//NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.//
//Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
//ArithmeticException и URISyntaxException.

public class Solution05 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        }
        catch (NullPointerException ex1) {
            System.out.println(ex1.getClass().getSimpleName());
            System.out.println(ex1.getMessage());
        }
        catch (FileNotFoundException ex2) {
            System.out.println(ex2.getClass().getSimpleName());
            System.out.println(ex2.getMessage());
        }

        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}

