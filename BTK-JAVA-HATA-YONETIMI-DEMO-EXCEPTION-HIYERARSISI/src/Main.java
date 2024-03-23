
public class Main {
    public static void main(String[] args) {
        //birden fazla catch kullanabiliriz.Çünkü uygulamalar bazen birden fazla hata verebilmektedir.
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[0]);
            System.out.println(sayilar[5]);
        }catch (StringIndexOutOfBoundsException exception){

            System.out.println("Hata Oluştu");
            System.out.println(exception);

        }catch (ArrayIndexOutOfBoundsException exception){//yukarıda üretilen sorununu yine bir üst catch karşılayamadı.
            //O hatayi bizim bu catch imiz karşıladı.
            System.out.println(exception);
        }
        catch (Exception exception){
            //bu kod bloğu neden yazılır *** Bu excaption *** Hangi exception gelirse gelsin karşılar** Peki neden yukarıdaki gibi tane tane ayıklayabiliyoruz.
            //Çünkü hatanın kaynağına türüne göre uygulamada, sayfada vs. o hataya göre yönelendirme yapabiliyoruz.
            //**hesapta para yoksa havale sayfasına vs. hatanın türüne göre davranışlar programlamacı için önemlidir.*****
            System.out.println("Loglandı"+exception);//Yazılımcılar kullanıcıların hangi sorunlarla kaşılaştğı hakkında bu loglar sayesinde öğrenir.

        }
        finally {
            System.out.println("Ben her türlü çalışırım.");
        }


    }
}