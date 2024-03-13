public class Main {
    public static void main(String[] args) {
//        EmailLogger logger = new EmailLogger();
//        logger.log(" Log Mesaji. ");
        //BaseLoggerda yazdığımız log message EmailLogger classının içersinde hiç bir şey yazmamış olsak bile extends
        // ettiğimiz için buradan erişebilmekteyiz.
        //BU noktada karşımıza OVERRİDİNG üzerine yazma çıkıyor

        /*BaseLogger da ki imzamız olan
        public void log(String message){
            System.out.println(" "+ message);
        }
        bu yapımızı
        DatabaseLogger, FileLogger, EmailLogger dada kullanıyoruz tek tek overriding ettik
        Biz bu loggeri şimdi CustomerManager içerisinde kullanalım.
        */
        /***************************************************************************************************************************/
//        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
        /** Yukarısı aslında İnheritance olan BaseLogger Heapte bir yeri referans ediyor bu referansı tutabildiği için bu atalamaları yapabiliyor. 3 elemanlı her biri farklı iş yapan, her birinin BaseLoggerı olan 3 eleman*/
        //Bu sistem kullanılarak istedğimiz kadar log ekleyebiliriz.
        //Sistemin ihtiyacına göre ek loglar eklenebilir. mesela şimdi ConsoleLogger classı oluşturup burada log olarak yerleştirelim.
        //Buraya ekleyebildiğimiz gibi ilerideki koşula göre loglardan çıkarmada yapabiliriz.
        //* BU SİSTEME TAK ÇALIŞTIR SİSTEMİ DİYORUZ*/
        //Bu olay polymorfizm oluyor.Bu sistemi böyle base classlarlada yapabiliriz yada ileride INTERFACE tarafını kavrayınca onlarlada kullanabilmekteyiz.

        //Baseloggerı alamamızın nedeni hespini içinde barındırabilmesi
//        for (BaseLogger logger:loggers){
//            logger.log("Log Mesajı");
//        }
        System.out.println("******************** Customer Managerda anlattığım olaydan sonrası en son kısım ***************");
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());//işte Polymorphsm burası olmuş oluyor içeriye istediğimiz loggerı yazmakta özgürüz
        //(CustomerManager.java)Burada içeride Baselogger yok. Aslında içeride DatabaseLogger var baselogger onun referansını tutuyor bi burada baselogger deyince o çalışmış oalcak.
        customerManager.add();
    }
}