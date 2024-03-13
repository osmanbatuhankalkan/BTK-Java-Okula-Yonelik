public class Main {
    public static void main(String[] args) {
        System.out.println("Bu Basit şekilde uygulamış halimizdi. Şimdi Öğrendiklerinizin üzerine ekleyerek daha komplike bir yapı yapalım.");
//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.hesapla(1000));

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager() };//Dizimizde 2 tane krediManahger var
        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));//Bu olayımız işte polymorfızmdi. Ne yapacak gidecek ogretmen için ayrı tarım için ayrı olarak hesaplayacak
            //
        }
        //Aşama Aşama gidiyoruz. Şimdi de diyelimki ogrencilere kredi imkanı oluştu Şimdi de onı yaratalım ve uygulayalım.
    }
    //***** YOL GÖSTERİCİ ÖZET ****/
    //BaseKrediManager,OgrenciKrediManager ve Main içinde gerekli notlar alındı.Tekrar için dönüdüğün zaman buralara bak.
    //Ön izleme olarak
    //-------------------------------------------------------------------------------------------------------------------
    //OGRENCİKREDİMANAGER:
    //Devlet dedi ki öğrencilere faiz 1.18 değilde 0.60 dan vereceksin
    /** ÖNEMLİ*/
    //BaseKrediManagera gidersekte hesapla kısmımın böyle olduğunu göreecğiz fakat önemli kısım şu:
    //!!!!!!! buradaki hesaplada yapacağın değişiklikle işlemler artık bu extends için geçerli olacaktır !!!!!!.
    //*********************** Base'in hesaplasını öğrenci için ezmiş oluyoruz. İşte Burada Overriding den yararlandık **********************************
    //javada bir classın herhangi bir operasyonu biz aksini belirtmediğimiz sürece overridable üzerinde yazılabilirdir.
    //-------------------------------------------------------------------------------------------------------------------
    //BASEKREDİMANAGER:
    /*************************************************** ÖNEMLİ BİLGİ **************************************************/
    //Birde tersten düşünelim. Biz basekredimanagerin hesapla fonk. main içinde kullandık ve ogrenci,tarım,ogretmen bu fonksiyona göre çalıştı
    //Sonrasında ogrencikredilerinde dedikki faiz oranları farklı ve biz ogrenci classında overriding yaparak ana faiz oranını ezdik ve kendi faizimizi belirledik. Ana sözü dinlemedik :)))
    //Ama şimdi 'final' keywordünü kullanarak Ana sınıfımız çocuk sınıfına sözünü dinlettirebiliyor rest çekiyor.Beğeniyorsa böyle çocuğum beğenmiyorsan kapı orada diyip OVERRİDİNG yapmamızı engelliyor ve SÖZÜNÜ EZDİRTMİYOR
    //Kullanımı ŞÖYLE;
//    public final double hesapla(double tutar){
//        return tutar*1.18;
//    }
}
