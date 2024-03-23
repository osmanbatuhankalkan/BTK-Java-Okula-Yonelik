//Projemizin içerisine bir class yapalım. bir bankasıcılık uygulmasında hesabı yönetmeyi sağlayan bir class olsun
//atmden para çekecek olalım hesapta olan paradan fazlasını çekince ne olur azını çekince ne olur tutar olsunce neolur vs
//bunun demosunu yapalım
public class Main {
    //Throw ifadesiyle bilinçli bir şekilde hata fırlatılır.
    //diyelim bir porjede bir paket yaptık ve bizden başkalarıda kullanacak.
    //bi ilinçli bir şekilde bilerek hata fırlatırız ve bu kullanıcınin, o hatanın türüne göre aksiyon almasını sağlarız.
    public static void main(String[] args)
    {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = "+manager.getBalance());//burada hesabımızdaki bakiyeyi çağırdık

        manager.deposit(100);//hesaba para eklendi
        System.out.println("Hesap = "+manager.getBalance());//eklenti sonrasi bakiye görüntüleme

        try {
                manager.withdraw(120);//hesaptan para çektik
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Hesap = "+manager.getBalance());//çekim sonrası kalan bakiye

        try {
            manager.withdraw(44);//hesaptan para çektik
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());//çekim sonrası kalan bakiye **NEGATİFE DÜŞTÜ bunu ***düzelteceğiz.


    }
}