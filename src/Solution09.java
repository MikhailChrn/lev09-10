import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution09 {
    //lev09: Ввести с клавиатуры дату в формате "2013-08-18"
    //Вывести на экран введенную дату в виде "AUG 18, 2013".
    //Воспользоваться объектом Date и SimpleDateFormat.

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date inputDate = new SimpleDateFormat("y-M-d").parse(reader.readLine());

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat.format(inputDate).toUpperCase());
    }
}



/*public static void main(String[] args) throws Exception {
        //НАИБОЛЕЕ КРАТКИЙ ВАРИАНТ
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date inputDate = new SimpleDateFormat("y-M-d").parse(reader.readLine());
        System.out.println(new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).format(inputDate).toUpperCase());
    }*/

