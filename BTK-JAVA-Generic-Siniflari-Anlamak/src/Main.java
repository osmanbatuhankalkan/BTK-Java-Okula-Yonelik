import java.util.ArrayList;

//JAVA GİBİ +.nesil dediğimiz dillerde önemli yere sahiptir.(java,C# gibi diller)Tip güvenli dediğimiz şekilde çalıştıkları için önemlidir.
//Hangi tiple çalıştığını bilmek ister java
public class Main {
    public static void main(String[] args)
    {
        //ARRAYLİST bir classtı. Class olduğunu onu newlediğimizden anlıyoruz.
        ArrayList sehirler = new ArrayList();
        sehirler.add("Antalya");
        sehirler.add("İstanbul");
        sehirler.add(1245);
        sehirler.add(true);
        //Parametre olarak OBJE verildiği için biz bu add in içerisne her şeyi verebiliriz.(örnk. String,int,boolen vs.)

        //Birde şu açıdan bakalım arraylistlere
        ArrayList <String> sadeceSehirler = new ArrayList<String>();//Bu yapıya **** GENERİC *** deniyor.
        //Neden ihtiyaç duyuluyor Generic yapılara dersek. Tip güvenliği için.
        sadeceSehirler.add("Tekirdağ");
        sadeceSehirler.add("SAMSUN");
        sadeceSehirler.add("ÇORUM");
        sadeceSehirler.add("KASTAMONU");
        //sadeceSehirler.add(5636);//Fakat artık yukarıda tür belirttiğimiz için sadece string tür olanları kabul ediyor.
        //sadeceSehirler.add(false);

        //************************************* Gerçek Hayat Örneği *******************************************//
        //projemizde veri tabanına bir müşteri ekleyeceğiz diyelim.
        //Customer
        //Product
        //Validator
        //Bana bir nesene ver ben bu neseneyi veri tabnaına ekleyeyim.
        //Nesne ürün değişir geri kalan tüm kodlar ayndır.Kısacası Biz GENERİCLERLE bir birine benzeyen operasyonları tip güvenliğiyle aynı formatta yazmayı başarmış oluyoruz.
        //ARRAYLİST olmasaydı ozaman sadece arraylerle çalışıyorduk.
        //şimdi MyList,Customer Sınıfı yaratıp, Mainimizin başlangıç noktasını aşşağıdaki commentin altından başladığını varsayarak örneğimize başlayalım
        //************************************* Gerçek Hayat Örneği *******************************************//
        MyList<String> sehirlerMylist =new MyList<>();
        sehirlerMylist.add("mylistin Antalyası");
        //sehirlerMylist.add(5231414); // HATA VERİYOR ÇÜNKÜ STRİNG DEĞİL

        MyList<Customer> sehirlerMylist2 =new MyList<Customer>();
        sehirlerMylist2.add(new Customer());
        sehirlerMylist2.add(new Customer());
        //Customerı oluşturup verdik ve sadece customer ila çalıştığını görebiliriyoruz

    }
}