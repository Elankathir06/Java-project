package mainprojectela;
import java.util.Scanner;
import java.sql.*;
public class Module3update1 {

	public static void main(String[] args) {
		try
		{
			int empId,empBsalary;
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the employee Id:");
			empId=s.nextInt();
			System.out.println("Enter the employee basic salary:");
			empBsalary=s.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
			PreparedStatement ps=con.prepareStatement("update accounts set Basic_salary=? where employee_Id=?");
			ps.setInt(1,empBsalary);
			ps.setInt(2,empId);
			
			
			int n=ps.executeUpdate();
			if(n!=0)
			{
				System.out.println(s+"Employee basic salary is updated");
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
