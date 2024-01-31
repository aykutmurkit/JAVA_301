import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("hello.txt");

        System.out.println("lütfen mesajı yazınız");
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        dosyaYaz(file,message);
        dosyaOku(file);

        scanner.close();
    }
    public static void dosyaYaz(File file,String message){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(message.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void dosyaOku(File file){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int c = 0;
            while ((c = fileInputStream.read()) != -1){
                System.out.print((char)c);
            }
            // read methodu bir kaynağın sonuna eriştiğinde -1 döndürüyor.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}