//Dal'ı hatırlayalım ***** veri erişim katman kodları******. (data access layer)
//*************** ÖNEMLİ *********************************
//ARTIK BİZ BURADA SADECE CUSTOMER'A AİT KDOLARI DOLDURUYOR OLUYORUZ. BU GENERİC YAPIYI KULLANARAK
//** GENERİC CONSTRAİNTS yani generic kısıttlar
public class CustemerDal implements IEntitiyRepository<Customer>{//Burada Customer için kullanacağımız içerisne belirttik dikkat edin
    //Hepsi customer olarak oluştu dikkat.

    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
//********************** ARADAKİ FARKI ANLAMAK İÇİN HATALI KULLANIMII ******************************************

//Fark ettiysek hepsi object olarak geldi OZaman biz generic kullanmamışız bu kullanım hatalı
//public class CustemerDal implements IEntitiyRepository {//
//
//    // @Override
////    public void add(Object entity) {
////
////    }
////
////    @Override
////    public void delete(Object entity) {
////
////    }
////
////    @Override
////    public void update(Object entity) {
////
////    }
//}
