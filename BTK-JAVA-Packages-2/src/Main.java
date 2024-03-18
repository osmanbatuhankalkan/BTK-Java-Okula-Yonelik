import matematik.DorIslem;
import matematik.Logaritma;

//Yada import matetmatik.*; diyerek matematik paketindeki her şeyi getir diyebiliriz.

import java.util.Date;
import java.util.Scanner;
//Bir paketi başka bir projede kullanmak istiyorsan onu import etmen lazım
//Main içinde bunu kullamnacağım anlamınada gelmektedir.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız: ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba "+isim);
        //kendi otomatik import etti . import ne demekti ben bunu kullanacağım demekti
        DorIslem dorIslem = new DorIslem();
        System.out.println("Sonucumuz:" +dorIslem.topla(5,32));

        Logaritma logaritma=new Logaritma();
    }
}
//**Paketlemeler aynı günlük hayatta kullandığımız gibi düşünelim bir dolabımız var ve içerisinde yazlıklar bir bölmede,kışlıklar bir bölmede
// istediğimizi rahatça hızlı ve kolay bir şekilde bulabiliyoruz.
// Ya öyle olmasaydı? Tersini düşünelim her şey bir birine girmiş aradığımız şeyleri zor buluyoruz.İşler biizm için karmaşıklaşacaktı.
// Javada da bu baplamda bu paketlerden yararlanırız. Modül Kütüphane gibi isimler alırlar
// KODLARII OKUDUĞUN ZAMAN KONUYLA İLGİLİ BİR CLASSI ARADIĞINDA HANGİ PAKETE GİDECEĞİNİZİ bilirsin.Ya da bir paketi baska bir projede de kullanabiliriz.SAdece o paketi alırız.
// Paket yapılar bazende daha sonra kullanılmak üzere kalır.** built-in ** javanın içinde var demektir.//

//Bir paketi başka bir projede kullanmak istiyorsan onu import etmen lazım