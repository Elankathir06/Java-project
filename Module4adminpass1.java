package mainprojectela;
import java.util.Scanner;
import java.sql.*;
public class Module4adminpass1 {

	public static void main(String[] args) {

		try
		{
			String username,password,h=null,h1=null;
			Scanner s=new Scanner(System.in);
			
			
			System.out.println("Enter the username");
			username=s.next();
			System.out.println("Enter the password");
			password=s.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cont=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Management","root","");
			Statement st1=cont.createStatement();
			ResultSet r1=st1.executeQuery("select * from Admin");
			
			while(r1.next())
			{

			h=r1.getString(1);
			h1=r1.getString(2);
			if(h.equals(username)&&h1.equals(password))
			{
				System.out.println("Welcome admin");
				System.out.println("1.employee_info,2.accounts");
				int ch;
				System.out.println("Enter the choice");
				ch=s.nextInt();
				if(ch==1)
				{
					System.out.println("1.insert,2.update,3.delete,4.select");
					int cho;
					System.out.println("Enter the choice");
					cho=s.nextInt();
					if(cho==1)
					{
						  try
							{
				        	    int Id,exp,prjdone;
								String name,dept,tech,email;
								int pass,confirmpass;
								long phno;
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
					else if(cho==2)
					{
						 try
							{
				        	    int Id;
								String name;
								
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
					else if(cho==3)
					{
						 try
							{
								String name;
								
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
					else if(cho==4)
					{
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
					else
					{
						System.out.println("Invalid choice");
					}
					
				}
				else if(ch==2)
				{
					System.out.println("1.insert,2.update,3.delete,4.select");
					int cho;
					System.out.println("Enter the choice");
					cho=s.nextInt();
					if(cho==1)
					{
						try
						{
							int empId,empBsalary,empWdays,empLdays,emplatedays,LOP,empbonus,empincentive,Tsalary;
							
							
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
					else if(cho==2)
					{
						try
						{
							int empId,empBsalary;
							
							
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
					else if(cho==3)
					{
						try
						{
							int empId;
							
							
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
					else if(cho==4)
					{
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
					else
					{
						System.out.println("Invalid choice");
					}
				}
				else
				{
					System.out.println("Invalid choice");
				}
			}
			else
			{
				System.out.println("Invalid username or  Password");
				System.out.println("kindly please check");

			}
		}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
