public class KronometreThread implements Runnable{//Runable java içinde hazır paket olarak geliyor
    //Burası threadi yönettiğimiz yer olacak
    private Thread thread;//dışarıya kapatalım
    //Bir threadi diğerinden ayırabilmesi için javanın isim vereceğiz
    private String threadName;
    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("Oluşturuluyor......."+threadName);
    }
    @Override
    public void run() {
        //run methodu bizim threadimizin kendisidir o işe yarar
        System.out.println("Çalıştırıyor: "+threadName);
        //başka her yerde çaıştırıdğımız classı burada çağırabiliriz. tüm kodu buraya yazarsak heriey bu threade bağımlı olur.
        //claası ister burada ister threadsız kullanabiliriz.
        try{
            for (int i=0;i<=10;i++)
            {
                System.out.println(threadName+" : "+i);
                Thread.sleep(1000);//yaz bir saniye bekle yaz 1 sn bekle demektir.
            }
        }catch (InterruptedException exception){
            System.out.println("Kesildi : "+threadName);
        }
        System.out.println("Threadin yapması gereken görev sonlandı....."+threadName);
        //yukarıdaki kod yerne veri tabanına bağladığımızı düşünelim 1milyon veribile çektirebilirsin.
        //Bizim thread operasyonumuzu şimdi hayata geçirmemiz gerekiyor startını vermemiz gerekiyor.
        thread.run();//run operasyonu threadı başlat demek oluyor. yukarıdaki run'ı çağırmış oluyor.

    }
    public void start(){
        System.out.println("Thread nesnesi oluşuyor.....");
        if(thread == null){//eğer varsa
            thread = new Thread(this,threadName);//bir clası çalıştırmak için newlemek gerekiyordu
            thread.start();
        }
        //Threade konu olan run methodu hariç geri kalan kısımlar standattır.
    }
}
