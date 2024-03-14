
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();//Buradaki newin amacı base ile oracle sql dönüşümünü yapabilmek
//        customerManager.databaseManager=new OracleDatabaseManager();//Biz müşterinin isteğine göre bunu configure edebiliriz. o esnekliği yakaladık.
//        customerManager.getCustomers();
//        customerManager.databaseManager=new SqlServerDatabaseManager();
//        customerManager.getCustomers();
        /*İleride MYSQL getirmek istedik SOLID prensip bir sisteme yeni bir özellik getirildiğinde mevcuttaki hiç bir kodu değiştiremezsin*/
        customerManager.databaseManager=new MysqlDatabaseManager();
        customerManager.getCustomers();
        //Bakın hiç bir koda dokunmadan yeni bir SQL configure edebildik


    }
}
//Şimdi yapacağımız örnekte bir tasarım deseni yapacağız. yani design pattern. onu uygulayacağız.
//örneğimiz şu olacak bir müşterinin veri tabanına kayıt edilmesi.
//Veri tabanlarıda kendi içinde yazım farkları olarak ayrılır.
//yazacağın kodlarda bu farlı sistemelre alan kişi inherit edebilmeli. Bu yapı abstructlara uygundur