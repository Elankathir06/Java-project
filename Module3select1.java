package mainprojectela;
import java.sql.*;

public class Module3select1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery("select * from Accounts");
		
		while(r.next())
		{
			System.out.println(r.getInt(1));
			System.out.println(r.getInt(2));
			System.out.println(r.getInt(3));
			System.out.println(r.getInt(4));
			System.out.println(r.getInt(5));
			System.out.println(r.getInt(6));
			System.out.println(r.getInt(7));
			System.out.println(r.getInt(8));
			System.out.println(r.getInt(9));
			
		}
		con.close();
		   System.out.println("data saved successfully......");
		   }
	   catch (Exception e)
		{
		   System.out.println(e);
			
	    }
	
		

	}

}
