package JDBC;

import java.sql.*;

public class JdbcTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/rsystem?serverTimezone=GMT%2B8";
        String username = "root";
        String password = "ryl123";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
            conn.setAutoCommit(false);
            String sql1 = "update bank set account = account - ? where id = ?";
            String sql2 = "update bank set account = account + ? where id = ?";
            ps = conn.prepareStatement(sql1);
            ps.setInt(1, 100);
            ps.setInt(2, 1);
            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ps.executeUpdate();

            int i = 10/0;
            ps = conn.prepareStatement(sql2);
            ps.setInt(1, 100);
            ps.setInt(2, 2);
            ps.executeUpdate();
            conn.commit();
        }catch(Exception e){
            e.printStackTrace();
            conn.rollback();
        }finally {
            if(ps!=null){
                ps.close();
            }
            if(conn!=null){
                conn.close();
            }
        }
    }
}
