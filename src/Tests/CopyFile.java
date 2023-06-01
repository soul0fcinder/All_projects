package Tests;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        //копирование файла с изменением кодировки
        if (copyFileUsingStream("src/Tests/utf8.txt", "UTF-8", "src/Tests/win1251.txt", "WINDOWS-1251")) {
            System.out.println("Перекодировка прошла успешно");
        }

        //сложение чисел из текстового файла
        //
        //                            (!)создание потока для сканера
/*        Scanner in = null;
        try {
            in = new Scanner(new FileInputStream("src/Tests/numbers.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Проблемы с ведённым входным файлом");
        }
        System.out.println(in.nextInt() + in.nextInt());

 */
    }
    // ВЕРСИЯ УДЛИНЁННАЯ
    private static boolean copyFileUsingStream(String source, String sourceEnc, String dest, String destEnc) {

        Charset sEnc = null;
        try {
            sEnc = Charset.forName(sourceEnc);
        } catch (UnsupportedCharsetException e) {
            System.out.println("Проблемы с кодировкой исходного файла" + e.getMessage());
            return false;
        }

        Charset dEnc = null;
        try {
            dEnc = Charset.forName(destEnc);
        } catch (Exception e) {
            System.out.println("Проблемы с кодировкой выходного файла");
            return false;
        }

        Reader fis = null;
        try {
            fis = new InputStreamReader(new FileInputStream(source), sEnc);
        } catch (FileNotFoundException e) {
            System.out.println("Проблемы входного файла: " + e.getMessage());
            return false;
        }

        Writer fos = null;
        try {
            fos = new OutputStreamWriter(new FileOutputStream(dest), dEnc);
        } catch (FileNotFoundException e) {
            System.out.println("Проблемы выходного файла");
            return false;
        }
        char[] buffer = new char[1024];
        int length;
        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("Проблемы при копировании");
            return false;
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("Проблемы при закрытии потоков");
                return false;
            }
        }
        return true;
    }
}
