public class Main {
    public static void main(String[] args) {
        //Yazılımda değişim ve gelişim çok önemlidir. Bizim işimizde değişime direnmeyen programlar yazmaktır.
        /** Banka kredi sistemi kuralım demomuz bunun üzerinde olsun*/
        OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();
        KrediUI krediUI = new KrediUI();

        krediUI.KrediHesapla(new OgretmenKrediManager());//Bellekte bu alanı oluştur öğretmenkredimanager içindeki kod çalışır.
        krediUI.KrediHesapla(new TarimKrediManager());//BasedKrediManageri Ana olarak tanımlayıp, KrediUI da bunu içeride tanımlayıp,
        // bunları ve bundan sonra açılacak krediManager başlıklarını Base ana olarak extends edersek
        //sektörel terim olarak enjekte etmek yukarıda görüldüğü gibi sade, sürdürülebilir, değişikliklre açık bir yapı üstüne kurmuş oluruz.



    }
}