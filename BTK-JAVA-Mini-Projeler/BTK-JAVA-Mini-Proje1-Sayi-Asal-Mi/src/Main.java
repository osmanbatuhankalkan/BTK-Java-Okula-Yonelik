
public class Main {
    public static void main(String[] args) {

        int sayi =1;
        int kalan = sayi%2;//Mod yarattık
        boolean isPrime = true;//sayımızı asal varsaydık.

        //İstisnalar
        if(sayi<1){
            System.out.println("Sayı Geçersizdir.");
        }
        //
        if (sayi==1){
            System.out.println("Sayı asal değildir.");
        }

        for (int i=2;i<sayi;i++)
        {
            if (sayi%i==0){
                isPrime=false;//Eğer tam bölünüyorsa asal değildir o yüzden asal olmayana çevirdik.
            }
        }

        //Bir sayı ya asaldır ya değildir mantığı
        if(sayi>1 && isPrime == true){
            System.out.println("Sayımız Asaldır.");
        }else{
            System.out.println("Sayımız Asal değildir.");
        }


    }
}