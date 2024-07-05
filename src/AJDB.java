
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;




public class AJDB {
    public static void main(String[] args) {
        getData();
    }
    public static Connection getConnection()
    {
        try {
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3306/lalitpur_eng";
            String username="root";
            String password="";
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(databaseUrl,username,password);
            System.out.println("Databae connected");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
        return null;
    }
    public static void getData()
    {
        try {
            Statement statement=getConnection().createStatement();
            ResultSet result=statement.executeQuery("select * from students");
            while (result.next()){
                System.out.println(result.getString("roll_no"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("email"));
                System.out.println(result.getString("address"));
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
