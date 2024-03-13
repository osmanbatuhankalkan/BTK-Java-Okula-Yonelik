public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar*1.18;//basit bir tutar hesap mekanizması bizim banka olarak uyguladığımız faiz(1.18) basit şekilde kurgu.
    }
    /*************************************************** ÖNEMLİ BİLGİ **************************************************/
    //Birde tersten düşünelim. Biz basekredimanagerin hesapla fonk. main içinde kullandık ve ogrenci,tarım,ogretmen bu fonksiyona göre çalıştı
    //Sonrasında ogrencikredilerinde dedikki faiz oranları farklı ve biz ogrenci classında overriding yaparak ana faiz oranını ezdik ve kendi faizimizi belirledik. Ana sözü dinlemedik :)))
    //Ama şimdi 'final' keywordünü kullanarak Ana sınıfımız çocuk sınıfına sözünü dinlettirebiliyor rest çekiyor.Beğeniyorsa böyle çocuğum beğenmiyorsan kapı orada diyip OVERRİDİNG yapmamızı engelliyor ve SÖZÜNÜ EZDİRTMİYOR
    //Kullanımı ŞÖYLE

//    public final double hesapla(double tutar){
//        return tutar*1.18;
//    }
}
