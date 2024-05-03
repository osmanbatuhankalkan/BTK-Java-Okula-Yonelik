import java.sql.*;
public class DbHelper {
    private String userName="root";
    static String password="59184072";
    static String dbUrl="jdbc:mysql://localhost:3306/btkdenemesql";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : "+ exception.getMessage());
        System.out.println("Error Code : "+ exception.getErrorCode());

    }
}
