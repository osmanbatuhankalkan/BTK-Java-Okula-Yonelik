public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        mesaj.substring(0, 3);//hiç bir şey yazmaz. cünkü void bir şey vermez.
        //String yeniMesaj = ekle();//String değere void atayamazsın.
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = cikar(100, 64);
        System.out.println(sayi);
        int toplam = topla2(1,2,3,4,5,6);
        System.out.println(toplam);
    }
    public static void ekle() {
        System.out.println("Eklendi.");
    }
    public static void sil() {
        System.out.println("Silindi.");
    }
    public static void guncelle() {
        System.out.println("Güncellendi.");
    }
    //bunlar void operasyon(yani fonksiyon) bu emir gibi düşünebilirsin gidip yapıyor.
    //illa void olmak zorunda değildir. void operasyona yap dersin yapar.
    public static int topla() {
        return 5;
    }
    public static int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }
    public static String sehirVer() {
        return "Antalya";
    }
    public static int topla2(int... sayilar) {//burada ... noktanın anlamı var "int array" yollamışsın diye algılıyor,istediğin kadar değer gönderebilirsin kendi otomatik ayarlıyor.
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
