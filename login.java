package ddh_bank;
import java.sql.*;
import java.util.*;

public class login {
	private String username;
	private String pass;
	Scanner sc=new Scanner(System.in);
	public login(String username, String pass) {
		super();
		this.username = username;
		this.pass = pass;
	}
	
	public void menu()
	{

		String pwd = null;
		String name=null;
		String mobno=null;
		String gender=null;
		String email=null;
		String address=null;
		
		
		//fetching the password from the database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5","root","root");
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from bank where username='"+this.username+"'");
			if (rs.next()) {
				name=rs.getString(2);
				mobno=rs.getString(3);
				email=rs.getString(4);
				gender=rs.getString(5);
				pwd=rs.getString(6);
				address=rs.getString(7);
			}
			else
			{
				System.out.println("Invalid entry / 503");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//execution starts here // validation of the password
		
		if (this.pass.equalsIgnoreCase(pwd)) {
			
			System.out.println("WelCome to DDH Bank");
			System.out.println("--------------------");
			System.out.println("\nLogin successfull\n");
			System.out.println("Welcome, "+name);
			
			System.out.println("We are happy to see you again...");
			System.out.println("\nyour details :\n");
			System.out.println("Name : "+name);
			System.out.println("username : "+this.username);
			System.out.println("Mob. No : "+mobno);
			System.out.println("email id : "+email);
			System.out.println("Address : "+address);
			System.out.println("Gender : "+gender);
			
			System.out.println("\nPlease choose the below services :\nBalance Check : 1\nWithdraw Amount : 2\ndeposite Amount : 3\nUpdate details : 4");
			int option=sc.nextInt();
			
			switch (option) {
			case 1:System.out.println("coming soon.");
				
				break;
				
			case 2:System.out.println("coming soon.");
				
				break;
				
			case 3:System.out.println("coming soon.");
				
				break;
				
			case 4:System.out.println("coming soon.");
				
				break;
				
			default:System.out.println("Invalid choice");
				break;
			}
			
			
		}
		else
		{
			System.out.println("please check your USERNAME or PASSWORD.");
		}
	}
}
