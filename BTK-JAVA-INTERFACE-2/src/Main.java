public class Main {
    public static void main(String[] args) {
        //diğer desen tavsiye edilmiyor çünkü program içinde sıkıntı çıkarmazken calısma anında sql seçilmesi unutulursa sıkınıt yapabiliyor.
        //o yüzden ikinci bir olan bu yola bakacağız.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //CustomerManager'ın içinde parametreli constructor tanımlamıştık ve onu şimdi burada çağırdık biz yukarudaki
        //nesenemizin parametresine hangi Sql implamantesini yazarsak artık onunla eşlecek o çalışacak.
        customerManager.add();

        //buda Polymorphismin interfacelerle uygulanmasıdır.
    }
}