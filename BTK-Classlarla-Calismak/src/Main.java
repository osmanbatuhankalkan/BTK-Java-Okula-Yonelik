public class Main {
    public static void main(String[] args) {
        //JAVA için çok önemli bir konu java yı java yapan zaten nesneye yönelik olması onun içnide bu konu çok önemlidir.(c# vs içinde bu geçerli).
        // Nesenel alt yapıyı sağlam tutuarsak sürdürüelbilir yazılımı devam ettirebiliriz. Bu ne demek uyugulamamıza sürekli yeni güncellemelere vs gelecektir.
        //insan alışlanlıkları her geçen gün değişmekte örn biz önce den de alışveriş yapıyorduk. bakkal,market,süper market, avm, artık internneten alışverişe geçiş gibi.
        //Bizlerin insan alışkanlıklarına direnen değil değişimine ayak uyduran yazılımlar yapmamız gerekmekte.
        //Classlar - soyutlama şeklinde devam edeceğiz.
        //Javada iş yapan her şey bir Class içinde oluşur.
        //Classlarla biz guruplamalar yaparız hesap mak için ayrı, alışveriş sitesindeki ürünler için ayrı operasyonlar yaparız.

        System.out.println("************* CLassı Çağırma ******************");
        CustomerManager customerManager = new CustomerManager();// Bir classın çağrımı böyledir. CustomerManger türünde bellekte nesne üretmiş oluyoruz.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        //Bunları Gruplamış olduk

        System.out.println("***************************************");
        //referans tiplidir classlar
        //Bir değişken tanımlatınca bellekte onu oluşturmuş oluyorsun
        // Şimdi 2. aynı tipte nesenemizi oluşturalım, bunlar aynı tipte 2 nesene olur fakat ÖNEMLİ: BELLEKTE AYRI YERİ OLUR AYRI YER TUTAR BİRİNİN YAPTIĞI DİĞERİNİ ETKİLEMEZ.
        CustomerManager customerManager2 = new CustomerManager();

        //Tamam bunu oluşturduk şimdi bu olayı biraz daha ilerisine taşıyalım
        customerManager = customerManager2;//Burada cM değişkenimize cM2 nin Referansını vermiş olduk artık ikiside cM2 nin bellekte gösterdiği yeri işaretliyor.
        //Peki bizim cM nin bellekte öncden tuttuğu yere ne oldu ? onu ram yöneticisi otomatik olarak siliyor (Garbage collactor).
        //bu yüzden kod geliştricilerin bu tür olaylarda dikkatli olması gerekiyor.

        System.out.println("****************** DEĞER TİP *********************");
        //Veriyi tutmayı sağlayan veri türleridir. Bunlar: integer, boolean, character ve float olarak sıralanabilir.
        //STACKTE tutulur
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);//?CEVAP 10

        System.out.println("****************** Referans TİP *********************");
        //Değer tiplerinden farklı olarak veri yerine verinin tutulduğu adresi tutar.
        // Referans tipler : array, class, interfaces, enum ve string olarak sıralanabilir.
        // Referans tipler heap bölgesinde tutulur.

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);//?CEVAP 10
        //DETAYlI AÇIKLAMA VE UYGULAMA DEFTERİNDE

        System.out.println("****************** DEMO CLASSES(Uygulama) *********************");
        //bir küçük hesap mak. uyg tolama çıkarma çarpma bölme yapan
        Dortİslem dortİslem = new Dortİslem();
        dortİslem.bölme(45,15);
        dortİslem.carpma(32,46);
        dortİslem.toplama(3,5);
        dortİslem.cikarma(33,66);
        System.out.println("Toplama: "+dortİslem.toplama(3,5));
        System.out.println("carpma: "+dortİslem.carpma(32,46));
        System.out.println("bölme: "+dortİslem.bölme(45,15));
        System.out.println("cikarma: "+dortİslem.cikarma(33,66));
    }
    }
