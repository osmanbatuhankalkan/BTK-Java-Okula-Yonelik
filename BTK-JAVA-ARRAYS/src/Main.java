public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Ahmet";
        String ogrenci3 = "Mehmet";
        String ogrenci4 = "Veli";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------------------------------------");
        //Şimdi yukarıdaki örneğimizi bir dizi şeklinde yazalım

        String[] ogrenciler = new String[4];//[] parantez içinde yazan sayımız kaç elemanınımızın olacağını belirler. **indeksler 0 dan başlar.
        ogrenciler[0]="Engin";
        ogrenciler[1]="Ahmet";
        ogrenciler[2]="Mehmet";
        ogrenciler[3]="Veli";

        for(int i=0;i<ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------------------------------------------");
        //Şu şekilde yazılabilir.
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
            //Buradaki mantık aslında c# da görmüştük foreach deki takma ad verip onu fonks. içinde çağırmaya benziyor.
        }
        System.out.println("------------------------------------------------------ BİR DEMO YAPALIM ------------------------------------------------------");

        //double[] myList = new double[4]; == double[] myList = {1.2,1.3,1.4,1.5}; bu iki yazımda bir birine eştir. böylede yazılabilir.
        double[] myList = {4.2,1.3,8.9,1.5};//arka planda otomatik newleniyor.
        double total=0;
        double max = myList[0];

        System.out.println("---------------------------- Sayıları ekrana yazıralım ----------------------------");
        for (double number:myList){
            System.out.println(number);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------------- Sayıların TOPLAMINI ekrana yazıralım ----------------------------");
        for (double number2:myList){
            total=total+number2;
        }
        System.out.println("Toplam= "+total);
        System.out.println("--------------------------------------------------------");
        System.out.println("---------------------------- Sayıların içinde EN BÜYÜK OLANI ekrana yazıralım ----------------------------");
        for (double number:myList){
            if (max<number)
            {
                max=number;
            }
        }
        System.out.println("En Büyük Sayı: "+max);
    }
    }
