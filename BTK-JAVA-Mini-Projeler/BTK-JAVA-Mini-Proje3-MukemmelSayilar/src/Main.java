public class Main {
    public static void main(String[] args) {
        //kendinden başka tüm pozitif sayıları toplamı kendini veriyorsa bı sayı Mükemmel Sayidir.
        int sayi = 6;
        int toplam=0;

        //Ana Mantık sayımıza kadar olan sayıları tek tek böl, kalanı 0'a eşit olanları toplam değerimze ekle
        for(int i=1;i<sayi;i++){
            if(sayi % i == 0){
                toplam = toplam +i;
            }
        }
        //Toplam değerimize eklenen bu sayılar, sayıya eşitse mükemmeldir.
        if(toplam == sayi){
            System.out.println("Mükemel Sayidir.");
        }else{
            System.out.println("Mükemmel Sayi Değildir.");
        }
    }
}