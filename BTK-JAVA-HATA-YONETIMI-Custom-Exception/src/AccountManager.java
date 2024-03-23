public class AccountManager {
    //Kendi Exceptionlarımızı yazabiliriz burada bunu göreceğiz
    private double balance;
    public void deposit(double amount){
        balance = getBalance() + amount;//para ekleme
    }
    public void withdraw(double amount) throws BalanceUnsufficentException
    {
        if(balance>=amount){
            balance = getBalance() - amount;//para çıkarma
        }else{
            throw new BalanceUnsufficentException("Hesabınızda yeterli miktarda para bulunmamaktadır.");
        }
    }
    public double getBalance() {
        return balance;//hesaptaki bilgiyi okumamızı sağlayacak (encapsulation uyguladık)
    }
}