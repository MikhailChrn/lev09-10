public class Solution02 {

    //lev09: Написать метод, который возвращает результат - глубину его стек-трейса
    // - количество методов в нем (количество элементов в списке).
    //Это же число метод должен выводить на экран.

    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
    }
}
