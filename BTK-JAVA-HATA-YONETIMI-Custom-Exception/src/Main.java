public class Main {
//Kendi Exceptionlarımızı yazabiliriz burada bunu göreceğiz
    //biz neden hata fırlatıyoruzz? çünkü bunu kullanacak olan bir başka programcı hatanın türüne göre doğru reaksiyon alabilsin.

    public static void main(String[] args)
    {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = "+manager.getBalance());//burada hesabımızdaki bakiyeyi çağırdık

        manager.deposit(100);//hesaba para eklendi
        System.out.println("Hesap = "+manager.getBalance());//eklenti sonrasi bakiye görüntüleme

        try {
            manager.withdraw(120);//hesaptan para çektik
        } catch (BalanceUnsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());//çekim sonrası kalan bakiye

        try {
            manager.withdraw(44);//hesaptan para çektik
        } catch (BalanceUnsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());


    }
}