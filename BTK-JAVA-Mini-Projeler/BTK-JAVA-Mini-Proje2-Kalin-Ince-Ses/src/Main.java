
public class Main {
    public static void main(String[] args) {
        char harf = 'A';
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harfler");
                break;

            default://Yukarıdaki durumlar geçerli olmaz ise çalışacak kısım.
                System.out.println("İnce Sesli Harfler");
        }

    }
}