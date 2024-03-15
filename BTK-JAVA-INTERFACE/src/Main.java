
public class Main {
    public static void main(String[] args)
    {
        CustomerManager customerManager = new CustomerManager();
        //interfaceler new'lenemiyordu,new lense bile içi boş o üyzden customerManager.customerDal = new OracleCustomerDal(); diyerek customerManagerin,customerDalı ndaki ekleme silme oracle ile yapıalacak
        //ileride Mysql e geçersek değiştirbiliriz yada eklenecekse SQLServer gibi eklenebilir.
        customerManager.customerDal=new OracleCustomerDal();
        customerManager.add();
        //Bu birinci yol, Birde ikinci yolu var
        //Artık çok fazla not olduğu için biribirine karıştı 2. bir dosya olarak atıcam orayabak !!!
    }
}
//polymorphism in en çok kullanıldığı yerlerden biriside interfacelerdir.

//    ICustomerDal customerDal = new ICustomerDal() {
//        @Override
//        public void Add() {
//
//        }
//    }
    //Bu da Abstructlar gibi new'lenemez.Hata ile karşılaşırız.

    /*ÖNEMLİ*/
    //Fakat interface onu implamante eden sınıfın(class) referansını tutabilir.
    //Bu olayda Polymorfizme girer.
    //************ICustomerDal customerDal=new OracleCustomerDal();

//INTERFACE Nerede Kullanılır ?
//Genelde katmanların arasındaki geçişleri sağlamak için kullanmaktayız.(data access-iş-arayüz)
// Bize artısı ne oluyor bağımlıklarımızdan kurtarıyor.
//***Temel olaarak
// newlenmezler
//İmza tutarlar
//implamente ile extend arasındaki fark ne ?
//CLasslar tek bir extennds edebilir fakat implementede sıkıntı yoktur.
//Hem extends hem implementes aynı anda da yapabilirsin
//interfacelerde onu kim kullanacaksa implamante etmesi gerekiyor. ettikten sonrada onun içerisinde imzalar taşıyabilir mainde implamnte ettiği sınıfları referans edebilir.
