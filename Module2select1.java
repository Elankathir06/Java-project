package mainprojectela;
import java.sql.*;
public class Module2select1 {

	public static void main(String[] args) {
		
				 try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
						Statement st=con.createStatement();
						ResultSet r=st.executeQuery("select * from Employee_info");
						while(r.next())
						{
							System.out.println(r.getInt(1));
							System.out.println(r.getString(2));
							System.out.println(r.getString(3));
							System.out.println(r.getInt(4));
							System.out.println(r.getInt(5));
							System.out.println(r.getString(6));
							System.out.println(r.getString(7));
							System.out.println(r.getLong(8));
							System.out.println(r.getInt(9));
							System.out.println(r.getInt(10));
				
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
