import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sample {
	public static void main(String[] args) {
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="hr";
			String pass="hr";
			Connection con=
					DriverManager.getConnection(url,user,pass);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from student");
			while(rs.next())
				System.out.println(rs.getString("id")+ " "+rs.getString("name"));
			System.out.println("Done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
