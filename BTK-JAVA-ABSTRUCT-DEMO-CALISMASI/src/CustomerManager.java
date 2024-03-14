public class CustomerManager {
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        databaseManager.getData();
        //Bu yapıyla beraber biz hangi veri tabanı sistemi verirsek ona göre çalışacak.!!!!!! İstediğimizde buydu zaten

    }
}
/* AMAN DİKKAT */
//Bunu yaptığınız anda geçmiş olsun oracle'a bağımlılık oluşturmuş oluyoruz. BAĞIMLILIKTAN KAÇIN!!!!
//        OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
//        oracleDatabaseManager.getData();

//Doğrusu yukarıdaki gibi olacak