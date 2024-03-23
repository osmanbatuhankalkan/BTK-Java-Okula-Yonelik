public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance = getBalance() + amount;//para ekleme
    }
    public void withdraw(double amount) throws Exception
    {
        if(balance>=amount){
            balance = getBalance() - amount;//para çıkarma
        }else{
            throw new Exception("Hesabınızda yeterli miktarda para bulunmamaktadır.");
        }
    }
    public double getBalance() {
        return balance;//hesaptaki bilgiyi okumamızı sağlayacak (encapsulation uyguladık)
    }
}
