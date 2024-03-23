public class BalanceUnsufficentException extends Exception{
    String message;
    public BalanceUnsufficentException(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
}
