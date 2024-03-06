public class Main {
    public static void main(String[] args)
    {
        //Stringler bir karakter dizisidir aslında bakarsan dizidir char arraydir içerisindekiburdaki her bir eleman tek tek mevcuttur olaya bu çerçeveden bakmak lazım.
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        //length
        System.out.println("Eleman Sayısı: "+mesaj.length());//Bu method bize elelman sayısını verecektir.
        //charAt
        System.out.println("5. Eleman: "+mesaj.charAt(4));//index 0 dan başladığı için 5. eleman 4.indeks e denk gelir.
        //concat
        System.out.println(mesaj.concat("Yaşasın!"));//concat birleştirmek demektir.
        System.out.println(mesaj);//fakat yaşasın eklenmiş olmadı görüyoruz
        //(start-end)with
        System.out.println(mesaj.startsWith("B"));//boolendir temeli b ile başlıyorsa true başlamıyorsa false döner.
        System.out.println(mesaj.endsWith("."));//yine aynı mantık fakat sonu . ile bitiyorsa true bitmiyorsa false döner.
        //JAVA CASE SENSİTİVE bir dildiir. içeriye B yazarsak onu arar b olması onu true döndürmez.

        //INDEXOF
        char[] karakterler = new char[25];
        mesaj.getChars(0,5,karakterler,3);//bu bizim için void bir operasyon yani bir şey döndürmez.GETCHARS bana karakterleri ver demektir yani char array karakter istiyor
        //sırasıyla şöyle demek 0. indekseten başla 4. indeks dahil al demek buna özel 5 dediysen o dahil değil. bunu karakterler dizisine 0.indeksten başlayarak yaz demek.burada opsiyonel 6. 7. indeksetende başlayabilirdi.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//ilk bulduğunu sana verir ve aramayı bitirir diğerlerine bakmaz.
        System.out.println(mesaj.indexOf("çok"));//kelime olarakta arayabiliriz.
        System.out.println(mesaj.lastIndexOf("a"));//aramaya sağdan başlar bunu şurdan anlıyoruz yukarıdaki a 7.indekste iken bu sağdan başladığı için 9.indeks sonucunu vermekte.

        //Replace: genelde ing ifadelerin türkçe ifadelere çevirilmesi yada blok başlıklarının aralarındaki boşlukların doldurulmaso yada değiştirilmesi gibi değişim türünde kullanılır.
        //** String fonksiyonların hemen hemen tamamı metnin kendisin değiştirmez,anlık yeni çıktı üretir.
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        //Substring: Metnin içeriseinden parça almak için kullanılır.SIKLIKLA KULLANILIR
        System.out.println(mesaj.substring(2));//0,1,2 den itibaren alır.2.indekseten iti baren öncesini yok eder.
        System.out.println(mesaj.substring(2,4));//2den başla 4 e kadar. 4.indeksi hesaba katmaz.

        //Split: bir metni belirli bir karakter ve karater dizisine göre parçalamaya yarar.
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }//Bütün kelimeleri tek tek yazdı görüyoruz.

        //LowerCase: küçük harfe çevirir mesajı. BUNLARI GENELDE VERİ TABANLARINDA ARAMA YAPACAKKEN KULLANIYORUZ.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());//zzıttıda vardır tabi tüm harfler büyük

        //Trim:bazen kaynaklardan aldığınız verilerde sağdan ve soldan boşluk olaiblir onları atar
        System.out.println(mesaj.trim());
    }
}