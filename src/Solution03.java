public class Solution03 {

    //lev09: Реализовать метод log.
    //Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
    //Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() +
                ": " +
                Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + text);
    }
}

