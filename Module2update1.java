package mainprojectela;
import java.util.Scanner;
import java.sql.*;
public class Module2update1 {

	public static void main(String[] args) {
		
					          try
								{
					        	    int Id;
									String name;
									Scanner s=new Scanner(System.in);
									
									System.out.println("Enter the Employee Id:");
									Id=s.nextShort();
									System.out.println("Enter the Employee name:");
									name=s.next();
									
									Class.forName("com.mysql.jdbc.Driver");
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
									PreparedStatement ps=con.prepareStatement("update Employee_info set Id=? where name=?");
									
									
									ps.setInt(1,Id);
									ps.setString(2,name);
									int n=ps.executeUpdate();
									if(n!=0)
									{
										System.out.println(s+"Employee Id is updated");
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
