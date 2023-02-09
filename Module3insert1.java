package mainprojectela;
import java.util.Scanner;
import java.sql.*;

public class Module3insert1 {

	public static void main(String[] args) {
		try
		{
			int empId,empBsalary,empWdays,empLdays,emplatedays,LOP,empbonus,empincentive,Tsalary;
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the employee Id:");
			empId=s.nextInt();
			System.out.println("Enter the employee basic salary:");
			empBsalary=s.nextInt();
			System.out.println("Enter the employee no of working days:");
			empWdays=s.nextInt();
			System.out.println("Enter the employee no of leave days:");
			empLdays=s.nextInt();
			System.out.println("Enter the employee officetime late days");
			emplatedays=s.nextInt();
			System.out.println("Enter the loss of pay");
			LOP=s.nextInt();
			System.out.println("Enter the employee bonus");
			empbonus=s.nextInt();
			System.out.println("Enter the employee incentive");
			empincentive=s.nextInt();
			System.out.println("Enter the total salary");
			Tsalary=s.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
			PreparedStatement ps=con.prepareStatement("insert into Accounts values(?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1,empId);
			ps.setInt(2,empBsalary);
			ps.setInt(3,empWdays);
			ps.setInt(4,empLdays);
			ps.setInt(5,emplatedays);
			ps.setInt(6,LOP);
			ps.setInt(7,empbonus);
			ps.setInt(8,empincentive);
			ps.setInt(9,Tsalary);
			
			ps.executeUpdate();
			con.close();
			System.out.println("Dtat saved .....");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
