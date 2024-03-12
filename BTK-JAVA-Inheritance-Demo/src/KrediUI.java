public class KrediUI {
    //Biz yazdığımız kodları bir arayüzden çağırırız bu sınıfımızın amacı budur.
//    public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager){
//        //Burada butonlar felan biribirine bağlıyacağız burada istediğimiz öğretmen manageri çağırma şuanlık.
//        ogretmenKrediManager.Hesapla();
//    }
    /** Yukarıdaki örnekteki gibi tek tek her krediManager ögesini tek tek çağırmak yerine biz BaseKrediManageri çağırıp tek sefer tüm hepsini
     * kapsayacak methodumuzu yazacağız.Peki bu nasıl olur da tek basına tüm hepsini kapsıyor? Çünkü bu onların annesi olmuş oluyor extends ettiğimiz için diğerli onların çocukları olarak düşünülebilir.
     * biz direk ana sınıfı çağırdığımız için tek seferde tüm kuşları vurmuş oluyoruz.*/
    public  void KrediHesapla(BaseKrediManager baseKrediManager)
    {
        baseKrediManager.Hesapla();
    }
}
