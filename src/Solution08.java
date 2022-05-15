public class Solution08 {
    //lev09: Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
    //Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (RuntimeException ruEx) {
            ruEx.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println(1 / 0);
    }
}

