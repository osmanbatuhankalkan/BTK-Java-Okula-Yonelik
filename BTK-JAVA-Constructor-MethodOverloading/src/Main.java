public class Main {
    public static void main(String[] args) {
        /** Constructor : yapıcı oluşturucu demektir. Oluşturulmasa bile default bir şekilde zaten geliyor biz new leyince o devreye girmiş oluyor
         * şimdi Product sınıfında kendi ismiyle bir constructor oluşturup burada çağırarak uygulamasını yapalım **/

        //parametresiz run edince parametresizin içindeki değeri bize verir fakat aşşağıdaki gibi istenilen parametrelerin girildiği bir constructor var ise bu çalışmaz.O değerlerin verildiği constructor çalışır
        /**Product product = new Product(); biz productı new leyince o yapıcı blok çalışacak**/


        //parametreli: Eğer product constructorunda o sınıfta yaratılan parametreli cons un değerleri uygun bir şekilde verilmiş ise bu consumuz o parametreli bloğu çalıştırır getirir.
        Product product = new Product(1,"name","MAC",35000,2,"gri");//biz productı new leyince o yapıcı blok çalışacak

        /*********************************************************************** ÖNEMLİ METHOD OVERLOADİNG ***********************************************************************/
        /****************** ASLINDA BU UYGULAMAYLA Bir yandan da BİZ OVERLOADİNG konusunda giriş yapmış oluyoruz **************/
        /** AYNI İSİMLE FARKLI PARAMETRE KULLANIMIDIR. Bir tarafta 6 parametreli consu diğer tarafta parametresiz consu bulunmakta.İsteyen istediğini kullanabilir.*/
        //biz classlarımızı içerisinde ortak alanları özellikleri tutmak için oluştururduk vs.
        //Hayal edelim biz bir projede bu topla fonks bir çok yerinde kullandık ve bize dediler ki artık 2 sayı değil 3 tane değişken sayı şeklinde güncelleyeceğiz.
        //mevcutta 2 ile çalışanlar olacak sonrasında 3 ile çalışanlarda olacak işte burada bizi kurtarıcı görev görüyor. DortIslem classına gidip bu uygulamayı inceleyebilirsin.
        //BU olay METHOT OVERLOADİNG olmuş oluyor.

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(22,343));
        System.out.println(dortIslem.topla(4,5,7));
    }
}