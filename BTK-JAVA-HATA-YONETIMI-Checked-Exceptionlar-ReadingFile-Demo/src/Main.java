import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {//dosyaları hızlıca okumak için önce belleğe alan sonra okuyan çok güzel bir classımız vardır.(BufferedReader)
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/osmanbatuhankalkan/Desktop/NTP Pack/BTK-JAVA-HATA-YONETIMI-Checked-Exceptionlar-ReadingFile-Demo/src/sayilar.txt"));//sen eğer try-catch içine almıyorsan ben zorunlu kılıyorum kullanacak için demektir.(throws FileNotFoundException eklentisi) static maine throws edilir. Bir diğer yol ise aşşağıdaki gibi try catchdir.
        }catch (FileNotFoundException e){//içerideki parametre hatayı sanaaa fırlatacağım demektirr. yukarıda başka türlü kullanışını zaten not olarak yazmıştım.
            e.printStackTrace();//Dosyayı bulamazsam yoksa hatası dır FileNotefoundException
        }finally {
            //bizim bu dosyayla ilgili olumsuz bir durum aldığımızda try'ı kapatmamız lazım
            reader.close();//Bu kod ne zamana Çalışır? dosya açık olmalı ki kapatsın. Ozmaan yukarı temel IOException eklemen lazım

            // Eğer yukarıya throws IOExcaption eklemek istemiyorsan içeriyi şöyle düzenletebilirisn.
            /** try{
              reader.close();
             }catch(Exception exception){

             }
             */

        }


    }
}