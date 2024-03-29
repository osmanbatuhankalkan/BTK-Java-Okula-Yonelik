import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();//Bağlantı oluşturmak için temel yapımısı oluşturduk
        PreparedStatement statement = null;
        ResultSet resultSet;

        //nedir bu PreparedStatement? aşşağıdaki executeQuery içerisinde yazılı olan parametreleri biz kullanıcıdan alırız.Buralar tamamen değişkendir kullanıcı neler verirse biz onları ekleriz.

        try {
            connection = helper.getConnection();//Hazırlar
            String sql = "delete from city where id = ?  ";//SQL im statementa aktarılır.
            statement = connection.prepareStatement(sql);//aktraılan sql preparestatement olarak hazırlanır.
            statement.setInt(1,1);//? işareti koyduymuz için dışarıdan değer verdik yukarıda değeri olan paramterler yerinede ? koyarsak dışarıdan veri verebilriiz.
            int result = statement.executeUpdate();//Buda kodu çalıştırır.
            System.out.println("Kayıt Silindi ...");

            //OLAYIN MANTIĞI BASİTCE: Connection aç,statement'ı oluştur ve onu çalıştır.

        }catch (SQLException exception){//Hatayı yönetebileceğimiz bir operasyon daha oluşturalım
            System.out.println(exception.getNextException());
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
    public static void updateData()throws SQLException//Update
    {
        Connection connection = null;
        DbHelper helper = new DbHelper();//Bağlantı oluşturmak için temel yapımısı oluşturduk

        //SELECT te statement kullanmıştık, Şimdi ise genelde INSERT işlemleri için kullanılan PreparedStatement'ı kullanalım.
        PreparedStatement statement = null;
        ResultSet resultSet;

        //nedir bu PreparedStatement? aşşağıdaki executeQuery içerisinde yazılı olan parametreleri biz kullanıcıdan alırız.Buralar tamamen değişkendir kullanıcı neler verirse biz onları ekleriz.

        try {
            connection = helper.getConnection();//Hazırlar
            String sql = "update city set population=99900 where id= ? ";//SQL im statementa aktarılır.
            statement = connection.prepareStatement(sql);//aktraılan sql preparestatement olarak hazırlanır.
            statement.setInt(1,2);//? işareti koyduymuz için dışarıdan değer verdik yukarıda değeri olan paramterler yerinede ? koyarsak dışarıdan veri verebilriiz.
            int result = statement.executeUpdate();//Buda kodu çalıştırır.
            System.out.println("Kayıt Güncellendi ...");

            //OLAYIN MANTIĞI BASİTCE: Connection aç,statement'ı oluştur ve onu çalıştır.

        }catch (SQLException exception){//Hatayı yönetebileceğimiz bir operasyon daha oluşturalım
            System.out.println(exception.getNextException());
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
    public static void insertData()throws SQLException//INSERT işlemlerinin olduğu BLOK
    {
        Connection connection = null;
        DbHelper helper = new DbHelper();//Bağlantı oluşturmak için temel yapımısı oluşturduk

        //SELECT te statement kullanmıştık, Şimdi ise genelde INSERT işlemleri için kullanılan PreparedStatement'ı kullanalım.
        PreparedStatement statement = null;
        ResultSet resultSet;

        //nedir bu PreparedStatement? aşşağıdaki executeQuery içerisinde yazılı olan parametreleri biz kullanıcıdan alırız.Buralar tamamen değişkendir kullanıcı neler verirse biz onları ekleriz.

        try {
            connection = helper.getConnection();//Hazırlar
            String sql = "insert into city(Name,CountryCode,District,Population) VALUES (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Adana");
            statement.setString(2,"TUR");
            statement.setString(3,"Turket");
            statement.setString(4,"1500000");

            //**BUNU SELECTTE kullanırız.*/ resultSet = statement.executeQuery("insert into city(Name,CountryCode,District,Population) VALUES ('Duzce','TUR','Duzce',50000)");//Execute çalıştır demektir.

            //INSERT KULLANIMI
//           statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population) VALUES ('Duzce','TUR','Duzce',50000)");
            //statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population) VALUES (?,?,?,?)");
            //Kullanıcı tarafından gönderilecek parametre şuan bilinmiyor. anlamında ? işaretleri fakat gelecek anlamında
            int result = statement.executeUpdate();//Buda kodu çalıştırır.
            System.out.println("Kayıt Eklendi...");

            //OLAYIN MANTIĞI BASİTCE: Connection aç,statement'ı oluştur ve onu çalıştır.

        }catch (SQLException exception){//Hatayı yönetebileceğimiz bir operasyon daha oluşturalım
            System.out.println(exception.getNextException());
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
    public static void selectDemo() throws SQLException//Burada Select ile arasındaki farkı göreceğiz INSERT kısmı yukarıda
    {
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