package mainprojectela;
import java.util.Scanner;
import java.sql.*;

public class Module3delete1 {

	public static void main(String[] args) {
		try
		{
			int empId;
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the employee Id:");
			empId=s.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
			PreparedStatement ps=con.prepareStatement("delete from Accounts where employee_id=?");
			ps.setInt(1,empId);
			
			int n=ps.executeUpdate();
			if(n!=0)
			{
				System.out.println(n+"one employee record is deleted");
			}
			else
			{
				System.out.println("Invalid Id");
			}
			con.close();
			System.out.println("Dtat saved .....");
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}


	}

}
