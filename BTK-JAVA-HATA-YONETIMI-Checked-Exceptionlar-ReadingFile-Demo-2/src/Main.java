import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//BU ÖRNEKTE METİN DOSYAMIZDAKİ SAYILARIN TOPLAMINI BULALIM.
public class Main {
    public static void main(String[] args){//dosyaları hızlıca okumak için önce belleğe alan sonra okuyan çok güzel bir classımız vardır.(BufferedReader)
        BufferedReader reader = null;
        int total=0;
        try {
            reader = new BufferedReader(new FileReader("/Users/osmanbatuhankalkan/Desktop/NTP Pack/BTK-JAVA-HATA-YONETIMI-Checked-Exceptionlar-ReadingFile-Demo-2/src/sayilar.txt"));//sen eğer try-catch içine almıyorsan ben zorunlu kılıyorum kullanacak için demektir.(throws FileNotFoundException eklentisi) static maine throws edilir. Bir diğer yol ise aşşağıdaki gibi try catchdir.
            String line=null;//içeride hiç bir şey olmayabilir.
            while ((line=reader.readLine())!=null){// reader.readLine() bir satır oku demek. okuyabiliyorsan true değeri dönecektir.
                total +=Integer.valueOf(line);//herhangi bir değeri integeria çevirebilirsiniz.
            }
            System.out.println("Toplam= "+total);
        }catch (IOException e){//içerideki parametre hatayı sanaaa fırlatacağım demektirr. yukarıda başka türlü kullanışını zaten not olarak yazmıştım.
            e.printStackTrace();//Dosyayı bulamazsam yoksa hatası dır FileNotefoundException
        }finally {
            //bizim bu dosyayla ilgili olumsuz bir durum aldığımızda try'ı kapatmamız lazım
            //Bu kod ne zamana Çalışır? dosya açık olmalı ki kapatsın. Ozmaan yukarı temel IOException eklemen lazım
            try{
             reader.close();
             }catch(Exception exception){
             }
        }
    }
}