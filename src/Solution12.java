import java.io.*;

public class Solution12 {
    //lev09: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
    //Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не существует."
    // и еще один раз прочитать имя файла с консоли, а уже потом считывать имя файла для записи.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream;
        OutputStream fileOutputStream;

        try {
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);

        } catch (IOException ex) {
            System.out.println("Файл не существует.");
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        String destinationFileName = reader.readLine();
        fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
