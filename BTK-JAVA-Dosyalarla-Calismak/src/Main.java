import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();
    }
    //****** txt oluşturma bloğu
    public static void createFile(){
        File file = new File("/Users/osmanbatuhankalkan/Desktop/NTP Pack/File/students.txt");//Burası bizim adres yolumuz olacak.
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Oluşturuldu...");
            }else {
                System.out.println("Dosya Oluşturulamadı..... Zaten var.....");
            }
        }catch(IOException e){//Hata mesajı fırlatır metin olarak çıkarırır.
            e.printStackTrace();
        }
    }
    //******** txt Okuma bloğu
    public static void getFileInfo(){
        File file = new File("/Users/osmanbatuhankalkan/Desktop/NTP Pack/File/students.txt");
        if (file.exists()){
            System.out.println("Dosya adı : "+ file.getName());//Dosya Adı Okuma Bloğu
            System.out.println("Dosya yolu : "+file.getAbsoluteFile());//Dosya yolu bulmak için
            System.out.println("Dosya yazılabilir mi : "+file.canWrite());//Dosya yazmak için
            System.out.println("Dosya yazılabilir mi : "+file.canRead());//Dosya Okumak için
            System.out.println("Dosya boyutu (byte) : "+file.length());
        }
    }
    //***** DOSYALARIN OKUNMASI
    public static void readFile(){
        File file= new File("/Users/osmanbatuhankalkan/Desktop/NTP Pack/File/students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
                //yani bu şu demek nextline yeni bir satır varmı? diye bakıyor. Varsa okunacak bir şey var demektir.
                // Mantık while false olana kadar adım adım döner.
            }
            reader.close();//Okuma bittiyse dosyadan çıkmak gerekir.
        } catch (FileNotFoundException e) {//Bu dosya olmassa diye kendisi otomatik endişe ettiği dururuma catch e yazdı.Bunu kontrol altına al diyor
            throw new RuntimeException(e);
        }
    }
    //***** DOSYALARIN YAZILMASI
    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/osmanbatuhankalkan/Desktop/NTP Pack/File/students.txt",true));//bu dosyanın içerisine rahatlıkla yazabiliriz artık.
            writer.newLine();//yeni satırdan başla demek append true ettikten sonra ekleecek herhangi şeyler önceki dosyamızın hemen ardına ekelencekti bizde o yüzden satır başında başla diyip sonrasinda algoritmamızı yazıyoruz
            writer.write("Ahmet");
            System.out.println("Dosyaya Yazıldı");
            writer.close();//işimiz bitince kapatmayı unutmayalım
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //**önemli BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/osmanbatuhankalkan/Desktop/NTP Pack/File/students.txt")); BU ŞEKİL YAZARSAN ÖNCEKİ DOSYAYI YOK EDER SADECE ŞUAN YAZDIĞIN BİLGİLERİ YAZAR.
        // BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/osmanbatuhankalkan/Desktop/NTP Pack/File/students.txt",true)); BU ŞEKİL YAZARSAN ÖNCEDEN VAR OLAN DOSYALARIN ÜSTÜNE EKELEME YAPAR APPEND DİYE ZATEN PARAMETRE AÇAR GÖRÜRSÜN

    }
}