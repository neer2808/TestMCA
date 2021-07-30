import java.sql.*;

public class connectivity {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.jdbc.Driver");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/MyDatabase","root","");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from stu");
    while(rs.next())
    {
      System.out.println(rs.getInt(1)+ "   " + rs.getString(2));

    }
    con.close();


  }
}
