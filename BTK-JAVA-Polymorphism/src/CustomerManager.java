//
public class CustomerManager {
    private BaseLogger logger;//ANA NESENEMİZ
    //newlediğimiz zaman çalışacak constructorumuz önceki derslerde görmüştük nasıl çalışma mantoğına sahip olduğunu
    public CustomerManager(BaseLogger logger)//Burada içeride Baselogger yok. Aslında içeride DatabaseLogger var baselogger onun referansını tutuyor bi burada baselogger deyince o çalışmış oalcak.
    {
        this.logger = logger;//içerideki parametremiz ne ise onu thisledik
        //ÖNEMLİ NOKTA: eğerki bu class çalışırsa ki çalışacak biz constructoru newlediğimizde otomatik olarak.
        //işte bu otomatik olarak çalışacak constructor BaseLogger logger olarak yazdığımız kısmı otomatik çalıştırmış olacak :))
        //yani aşşağıdaki yaptığımız işlem, bağımlılık olamadan Ana sisteme bağlı olarak değişikliklere göğüs gerebilecek,esnek olacak
    }
    public void add(){
        System.out.println("Müşteri eklendi.");
        this.logger.log("Log mesajı");//Bunu çağırmazsak çalışmaz
    }
}



//    public void add(){
//        System.out.println("Müşteri Eklendi.");
//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log("Log mesaj");
//        //Fakat burada da artık bir problemimiz oluşmaya başlıyor "new" problemi.Bir classı başka bir klassta new yapmaktan artık kaçınmak gerekmektedir.
//        //biz databaseloggera körü körüne bağlanmış oluyoruz. Bize dezavantajı şu olur: projenin başından bize talimat gelir artık databaseloggerı kullanmayacağız kaldırmamız gerekiyor gibisinden bir örnekle karşılaşlıabilir.
//        //Bütün kodlardan bu bağımlı sistemi düeltmek gerekecektir.
//        //Bunun önüne nasl geçeceğiz bağımlı sistemenin TEMEL NESENE ANA NESNEYLE ÇALIŞARAK ŞİMDİ BU HATALI GÖSTERİMİ COMMENTLINE ALIP BU DOĞRU YAPIMI UYGULAYALIM.
//    }
    //Bu eklenme olayı gerçekleşti diyelim. bunu müşteriyi eklediğine dair bir yere yazman gerekir. bu datatı kim ekledi ne zmaan eklendi gibi Loglarla çalışırız biz yazılım projelerinde.

