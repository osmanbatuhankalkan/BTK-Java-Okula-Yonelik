public class PorductValidator {
    static {
        System.out.println("Static Yapıcı BLok Calıstı");
        //C# olduğu gibi ana classs static olamaıyor fark var
    }

    public PorductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
        //Fakat bunun çalışmadığını göreceğiz çünkü ProductManagerde bunu new lemedik. Newleyince çalışacak
    }

    //Doğrulama işlemi yapacağız burada
    public static boolean isValid(Product product){
        //Sana bir product vereceğim bunu doğrula dedim.
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
    //INNER CLASS deniyor. temel classs var içerisinde onları bölümlendiren classlar olabiliyor.
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
