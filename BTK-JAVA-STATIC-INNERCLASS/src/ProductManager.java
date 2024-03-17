public class ProductManager {
    //veri tabanına gönderelim ekleyelim o nesnemiz burası
    public void add(Product product){

        if (PorductValidator.isValid(product))
        {
            System.out.println("Eklendi");
        }else{
            System.out.println("Eklenemedi Ürün bilgileri geçersizdir");
        }

    }
}

//*****************STATİC KULLANMADAN ÖNCEKİ GÖSTERİM*************
//public void add(Product product){
//    //Newleyip kullandık
////        PorductValidator validator = new PorductValidator();
//    if (validator.isValid(product))
//    {
//        System.out.println("Eklendi");
//    }else{
//        System.out.println("Eklenemedi Ürün bilgileri geçersizdir");
//    }
//
//}

//Staticler 1 kere kurulur herkes onu kullanır bir web sayfasında
//static tanımlanınca aynı newleyince örnek oluşuyordu, o örnek bizim işimiz bitince bellekten atılıyordu.
//işte static yapınca bellekten atılmıyor orada kalıyor.
//ilk kullanan statici çağırıyor sonra gelen her kullanıcı aynı statici kullanıyor.
//Bu tip manager sınıfları statıc yapılmaz.
//özetle bir metotu static yapınca class ismi ile direkt çağırılır.
