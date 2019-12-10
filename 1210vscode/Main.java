import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.math.BigInteger;
import java.security.MessageDigest;

public class Main{
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://210.70.80.21:3306/";
    static final String UID = "s107021159";
    static final String PWD = "eeXaeng4";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt  =null;
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, UID ,PWD);
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;

            sql = "SELECT * FROM user";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String userName = rs.getString("name");
                String passwd = rs.getString("passwd");
                String email = rs.getString("email");

                System.out.print("ID:"+id);
                System.out.print(",name"+userName);
                System.out.print(",passwd"+passwd);
                System.out.print(",email"+email);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt != null)
                   stmt.close();
            }catch(SQLException se2) {
            }
            try{
                if(conn != null)
                   conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}