import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        //şimdi bir balantı yapmaya çalışacağız , bağlanamama durumunu göze alarak try-catch bloğu yazalım.
        Connection connection = null;
        DbHelper helper = new DbHelper();//Bağlantı oluşturmak için temel yapımısı oluşturduk

        try {
//            DbHelper helper = new DbHelper();//Bağlantı oluşturmak için temel yapımısı oluşturduk
            connection = helper.getConnection();
            System.out.println("Bağlantı oluştu");
            //Hatayı yönetebileceğimiz bir operasyon daha oluşturalım
        }catch (SQLException exception){
            System.out.println(exception.getNextException());
            //Burada ilk önce helperile çağırmak istedik fakat hata aldık çünkü try da tanımlıydı.
            //Bizde bir tık daha geniş bir alana koyarak ikisininde erişebilecğei seviyeye getiriyoruz.
            //önceki hali duracak orayı commentleyeceğim.
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
}
//Şuan yaptığımız kodları mainden farklı bir classa çekelimki farklı zamanlarda farklı yerlerden çekebilelim, istediğimiz zaman kullanabilelim
//ilerleyen zamanda katmanlı mimariye geçip daha gelişmişlerini göreceğiz.

//    static String userName="root";
//    static String password="59184072";
//    static String dbUrl="jdbc:mysql://localhost:3306/btkdenemesql";
//yukaridaki kodları MAİN DEN -----> DbHelper classına çektik
//İlk önce normal mainde nasıl kullanılır onu öğrendik sonrasında classa çektik
//**
//         try {
//            connection = DriverManager.getConnection(dbUrl,userName,password);
//            System.out.println("Bağlantı oluştu.");
//        }catch (SQLException exception){
//            System.out.println("Hata: "+exception.getMessage());
//        }
//        finally {
//            connection.close();//iş bitince kapatır.
//        }*/