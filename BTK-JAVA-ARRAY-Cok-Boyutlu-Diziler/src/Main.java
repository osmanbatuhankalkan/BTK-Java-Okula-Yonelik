public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];//matrixlerden de bilidğimiz gibi satır sütunu temsil ediyor ve 9 elemanımızın olacağını anlıyoruz
        System.out.println("----------------------------- Şehir ve Bölgelerin gösteriminin Demosu -----------------------------");
        //Şimdi Manuel olarak kendimiz yazıyoruz ilerleyen zamanda bu veriler otomatik gelecek
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Çorum";
        sehirler[1][2]="Tokat";
        sehirler[2][0]="Antalya";
        sehirler[2][1]="Mersin";
        sehirler[2][2]="Adana";

        System.out.println("Burada iç içe döngüleri kullanıyoruz matrix sayımıza göre");
        for(int i=0;i<=2;i++)
        {
            System.out.println("----------------------");
            for (int j=0;j<=2;j++)
            {
                System.out.println(sehirler[i][j]);
            }
        }
    }
    }