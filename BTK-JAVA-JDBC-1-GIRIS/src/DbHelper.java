import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {//Adı üzerinde veri tabanı yardımcımız olacak
    static String userName="root";
    static String password="59184072";
    static String dbUrl="jdbc:mysql://localhost:3306/btkdenemesql";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    //Hatayı yönetebileceğimiz bir operasyon daha oluşturalım
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error Code: "+exception.getErrorCode());
    }
    //Peki biz bunu nasıl çağıracağız MAine gidip catch'İn içerisine bakalım orada da açıklamam olacak
}
