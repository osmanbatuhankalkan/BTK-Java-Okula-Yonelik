//çok önemli bir konudur bir programda olmazsa olmazlardandır.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList sayilar = new ArrayList<>();
    //bakın 3 eleman 5 eleman olacak diye bir zorunluluk yok
        System.out.println(sayilar.size());//0 verecektir çünkü eleman yok
        sayilar.add(1);
        sayilar.add(100);
        System.out.println(sayilar.size());// 2 eleman olarak geldi
        sayilar.add("Ankara");
        System.out.println(sayilar.size());//Bakın 3 oldu
        //**önemli** OBJE türünden değer tuttuğu için int string gibi dizilerdeki gibi tanımlama yapmadık isteğimize göre int yada stringi aynı anada kullanabiliyoruz.
        //bu ArrayListin TEMEL kullanımıdır.
        System.out.println("**********");

        System.out.println(sayilar.get(2));//indexi ister o sırada getirir. Bize Ankarayı verecektir.
        System.out.println(sayilar.get(0));// bize 1 değerini verecektir.
        sayilar.set(0,20);
        System.out.println(sayilar.get(0));//bakın burada set edip değiştirdiğimiz için 1 değeri yerini 20 ye bıraktı
        //ELEMAN GÜNCELLEME BÖYLE yapılmakta
        System.out.println("**********");

        sayilar.remove(0);
        System.out.println(sayilar.get(0));
        //Fark ettiysek dizimiz silinen yere doğru kayıyor sola doğru
        System.out.println("**********");

        sayilar.clear();//Tüm elemanları siliyor.
        //System.out.println(sayilar.get(0));//hata alacağız çünkü 0 var
        System.out.println("**********");

        //FORACH olarakta gezebiliriz dizileri nasıl geziysek o şekil gezebiliriz.
        for (Object i:sayilar){
            System.out.println(i);
        }
        //BUNLAR YAZILIMIN GELİŞİMİ DİZİ->ARRAYLİST->Generic Yapılar somut yapı severiz. intte olur stringte olur gibi kullanımlar günümüzde datan kirli dğeilse bu tarz yazarız tip güvenli çalışmalar



    }
}

//int[] sayilar = new int[]{1,2,3};//Dizilerde mantık şuydu biz tanımlar tanımlamaz referans olarak değerleri tutulurdu ve 1,2,3 olarak değerleride oluşurdu.
//sayilar[3] =4;//Bu sınırın dışına çıktığımız için hata verecektir. 0 var 1 var 2 var. böyle bir şey yok
//Bunu sağlamak için
//sayilar = new int[4];
  //      System.out.println(sayilar[2]);//Bizim beklediğimiz çıktı 3 iken null değer karşlığı olan 0 gelecektir.
//neden böyle oldu? çünkü new demek yeni bir referans demektir. Karşılığı çöpe gitti.
//new dendiği anda bellekte yeni bir alan oluşuyor.BU Dİzilerin temel yapısıdır.

//**Kolleksiyonlarda arka planda bu dizileri yönetirler fakat new dendiği anda o ilkbaşta tutululan 3 farklk değeri diziler yeni yaratılan bellekteki yere getiremiyordu
//Bu olayı koleksiyonlar aşıyor dizilerin geliştirilmiş halidir.Günlük hayatta dizileri az kullanırız gelişmişi olan koleksiyonlar daha çok kullanılmakta.
//Diziler programlamaının temelinde olduğu için geliş yerinin mantığını anlamak adına önemliydi