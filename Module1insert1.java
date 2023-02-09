package mainprojectela;
import java.util.Scanner;
import java.sql.*;
public class Module1insert1 {

	public static void main(String[] args) {

			          try
						{
			        	    int Id,exp,prjdone;
							String name,dept,tech,email;
							int pass,confirmpass;
							long phno;
							Scanner s=new Scanner(System.in);
							System.out.println("Enter the Employee Id:");
							Id=s.nextInt();
							System.out.println("Enter the Employee Experience:");
							exp=s.nextInt();
							System.out.println("Enter the no of projects done:");
							prjdone=s.nextInt();
							System.out.println("Enter the Employee name:");
							name=s.next();
							System.out.println("Enter the Employee department:");
							dept=s.next();
							System.out.println("Enter the Employee Technolgy:");
							tech=s.next();
							System.out.println("Enter the Employee E-mail Id:");
						    email=s.next();
							System.out.println("Enter the Password:");
							pass=s.nextInt();
							System.out.println("Enter the Confirmpassword:");
							confirmpass=s.nextInt();
							System.out.println("Enter the Employee Phonenumber:");
							phno=s.nextLong();
							
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
							PreparedStatement ps=con.prepareStatement("insert into Employee_info values(?,?,?,?,?,?,?,?,?,?)");
							
							ps.setInt(1,Id);
							ps.setString(2,name);
							ps.setString(3,dept);
							ps.setInt(4,exp);
							ps.setInt(5,prjdone);
							ps.setString(6,tech);
							ps.setString(7,email);
							ps.setLong(8,phno);
							ps.setInt(9,pass);
							ps.setInt(10,confirmpass);
							ps.executeUpdate();
							con.close();
							System.out.println("data saved successfully......");
						}
						catch (Exception e)
						{
							System.out.println(e);
							
						}

	}

}
