
public class Main {
    public static void main(String[] args)
    {//Klasıkleşmiş örneği kronometre örneğidir. aynı anda 2,3 kronomometre açabiliriz.Bu örneği yapacağız.
        KronometreThread thread1 = new KronometreThread("Thread 1");
        KronometreThread thread2 = new KronometreThread("Thread 2");
        KronometreThread thread3 = new KronometreThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
        //hepsini aynı anda başlatıyoruz.
        //bütün threadlar aynı anda çalışmaya başladı
    }
}
//** Thread ve multi thredler olarak yapılarımız var.
//Thredlerimizi düz birer çizgi olarak düşünebiliriz
// yaptımızı operasyonların, metotların gerçekleşme zaman çizelgesi olarak düşünebiliriz.
// bu düz çizelgede bölümlere ayrılmış metotlarişler var diyelim bir bölüm 3sn bir bölüm 5sn vs çalışıyor gibi hayal edelim.
//
// Operasyon yada metotların süresi çizelgede tamamlanınca bir sonraki işe geçer ve böyle devam eder.
// Thredi bir yaşam döngüsüne benzetebiliriz. ve sırasıyla operasyonları çalıştırdığını düşünebiliriz.
// Bu noktada multi threaded uygulamalarda ise thre'e çzigi deditsek burada birden fazla zaman çizgimiz varmış gibi hayal edelim.
//
// Bu sayıyı genelde Java tarafından ayarlanır ve CPU çekirdek sayımızın bu konuda önem arz eder.
//
// Yine bizim operasyonlarımızın ardı ardına çalıştırılacaktır.Fakat tüm thredleri operasyonları yakın zamanlarda çalıştırılacaktır.
//
// Ozaman tüm uygulamlarda multi thred kullanalım sorusu kafalara gelmekte. Hayır oda tek başına doğru olmayacaktır.
// Thread yapacağımız Nokta bizim iş ihtiyacımıza göre değişkenlik göstermekte.
//
// OPERASYONLAR BAĞLIYSA TEK Thread
// OPERASYONLAR BAĞIMSIZ İSE MULTİ Thread
// kullanılabilir. */
//
//
// Genellikle bir operasyon içerisnde yapılar, Herzaman değil,genellikle birbirini bekleyen biri bitince diğerinin yapıldığı bir yapı üzerine kurulur.
// Örneğin; Müşteriyi ekleyip daha sonra müştreinin müşteri profilinin yapılması yani insort,insort, başka yeer update gibi
// yani böyle sıralı oluyor.
// Sıralı olmayan uygulamalarda Multi Thread deb yararlanabiliyoruz.
// Bu noktada dikkat edilmesi gereken husus şudur.
// Bu çok threadle çalışalacağo zaman birbirinde oluşan data, diğerinde diğerinden ilgilendiriyorsa ozaman ona göre singile mi? multi mi? dikkat etmek gerekiyor
// Genellikle multi çalışmayı gerektirmeyen durumlar daha fazladır.
// Bir mobil uygulama hayal edelim, bir butonu var ve ona tıklıyoruz. oda bir data getirme yada kayıt etme işi yapıyor diyelim.
// Ve bunun süresi 5 sn diyelim.Bu durumda kullanıcıyı beklerken yanıt almıyor gibi hataların gösterimi için yine threadlerden yararlanılır.
// TEMEL ANLAMDA BU şekil bir ortaya çıkıyor.
//
//*/