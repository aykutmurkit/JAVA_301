import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        //file sınıfının bu yapıcı methodu bir path alır.

        String dosyaYolu = "C:\\Users\\amurkit\\Desktop\\sample\\aykut.txt";
        File file = new File(dosyaYolu);

        System.out.println("dosya var mı?         --> " + file.exists());

        System.out.println(file.canRead()); // okuma iznimiz varmı
        System.out.println(file.canWrite()); // yazma iznimiz varmı
        System.out.println(file.isDirectory()); // bir Directory mi?
        System.out.println(file.getAbsolutePath()); // dosyanın bulunduğu tam konumu
        System.out.println(file.getParent()); // bir üst path
        System.out.println(file.length()); // dosyanın içinde kaç byte olduğunu döndürür.

        System.out.println(file.lastModified()); // geçen zamanı milisaniye olarak döner.
        System.out.println(new Date(file.lastModified())); // yapıcı methodunun milisaniye alan yapıcı methodu

        // kendimizde dosya oluşturabiliriz.

        File file2 = new File("C:\\Users\\amurkit\\Desktop\\sample\\aykut2.txt");
        if(!file2.exists()){
            try {
                file2.createNewFile(); // dosya oluşturdu.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        if(file2.exists()){
            boolean silindimi = file2.delete(); // dosya silmek için kullanılır.
            System.out.println("silindi mi? "+silindimi);
        }

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dosya yolu:");
        String path = scanner.nextLine();

        File file = new File(path);
        String[] icerik = file.list(); // file bir klasör ise klasörün içeriğini döndürmekte.

        for (String s : icerik) {
            System.out.println(s);
        }
        scanner.close();

    }
}