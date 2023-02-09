package mainprojectela;
import java.util.Scanner;
import java.sql.*;
public class Module2delete1 {

	public static void main(String[] args) {

				 try
					{
						String name;
						Scanner s=new Scanner(System.in);
						
						System.out.println("Enter the Employee name:");
						name=s.next();
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
						PreparedStatement ps=con.prepareStatement("delete from Employee_info where name=?");
						
						
						ps.setString(1,name);
						int n=ps.executeUpdate();
						if(n!=0)
						{
							System.out.println(n+"Employee record is deleted");
						}
						else
						{
							System.out.println("Invalid name");
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
