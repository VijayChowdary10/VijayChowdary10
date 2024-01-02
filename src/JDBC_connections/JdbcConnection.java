package JDBC_connections;
import java.sql.*;
public class JdbcConnection {
	
	private static Connection con=null;
	
	
public static void main(String args[]) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	final String url="jdbc:mysql://localhost:3306/vijay";
	final String acc="root";
	final String password="@Firearrow10";
	if(con == null) {
	con=DriverManager.getConnection(url,acc,password);
	Statement statement= con.createStatement();
	
	//String insert="insert into student(id , name , age) values(\"9\",\"divya\",\"24\");";
	 int s=statement.executeUpdate("insert into student(id , name , age) values(\"80\",\"divyaa\",\"24\");");
	 System.out.println(s);
	}
}	
}

