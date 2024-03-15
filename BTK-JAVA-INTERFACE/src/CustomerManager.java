public class CustomerManager {
    ICustomerDal customerDal;
    public void add(){
        customerDal.Add();//Bu olay ne demek customerManagerin , custemerDalı var biz onun Add'ini Çağıracağız demek.(maine gidiyoruz.)


        //Zaten bu fonksiyon Dal'larda var neden burada da kullandık?
        //Burada kullanıldan fonksiyonda iş kodları yazılır.Biz müşteriyi eklemek için parametre göndeririz ad doğrumu müşteri tcsi doğrumu vs.
        //iş katmanıyla veri erişim sadece birbirini çağırıyor.

        //*HATIRLATMA BU OLAY BAĞIMLI KILIYORDU BİZİ BUNU KULLANMA*//
     // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();

    }
}
