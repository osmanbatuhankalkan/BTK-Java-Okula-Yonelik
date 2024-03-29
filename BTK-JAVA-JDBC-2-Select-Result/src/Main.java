import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();//Bağlantı oluşturmak için temel yapımısı oluşturduk

        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = helper.getConnection();
            //statement nesene oluşumu elimizdeki bağlantıya oluşturma 3 farklı veri tsbanıyla aynı anada çalışıtğını farz et en uç noktada
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");//Execute çalıştır demektir.
            //**** ÖNEMLİ**************//
            //Bu ArrayListi while'ın dışında yapınız aksi takdirde sürekli newlenir sürekli yeniden yaratılır.
            ArrayList<Country> countries = new ArrayList<Country>();

            //Bu resaultsetteki datayı bastıralım.
            while (resultSet.next())
            {
                countries.add(new Country(resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
            //Hatayı yönetebileceğimiz bir operasyon daha oluşturalım
        }catch (SQLException exception){
            System.out.println(exception.getNextException());
            helper.showErrorMessage(exception);
        }
        finally {
            connection.close();
        }

    }
}
