
public class Main {
    public static void main(String[] args) {
        //try içimdeki kodu çalıştırmayı dene anlamıan gelmektedir.
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[0]);//bu çalışacakken
            System.out.println(sayilar[5]);//bu kod normal görünüşte hata vermiyor gibi duruyor fakat buiild olduktan sonra arrayındexoutofboundsexception hatasını verecek.
            //Bir alışveriş sitesi için uyarlayalım bu sorunu dizi dinamik olarak verilecektir. kimi zaman 3 kimi zaman 5 eleman gelecektir.
        }catch (Exception exception){
            //try dene,çalışmaya çalışır olurda try içinde hata varsa catche gel.
            // try içinde oluşan hata catche parametre olarak verilir.
            System.out.println("Hata Oluştu");
            System.out.println(exception);//bunun sonucuda parametre olarak geldiğinin kanıtı sen 3 eleman vermişsin 5i istiyorsun diye uyarır.

        }finally {
            //finally adı üstünde en son çalışacak bloktur. ister try çalışsın ister catch o hangisi çalışsın fark etmez çalışır
            System.out.println("Ben her türlü çalışırım.");
        }
        //gerçek hayat örneği bir veri tabaına bağlandın ve hata oluştu. Veri tabanına bağlandıktan sonra bağlanıtıyı kapatmak gerekir.
        //işte finally de o bağlantıyı kapatabilirsin aynısı bir dosya içinde geçerli

    }
}