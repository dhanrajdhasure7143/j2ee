package ddh_bank;
import java.sql.*;

public class register_dao {
	public static void insert(register u1)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc5","root","root");
			PreparedStatement ps=con.prepareStatement("insert into bank values(?,?,?,?,?,?,?)");
			
			ps.setString(1, u1.getUsername());
			ps.setString(2, u1.getName());
			ps.setString(3, u1.getMobno());
			ps.setString(4, u1.getEmail());
			ps.setString(5, u1.getGender());
			ps.setString(6, u1.getPassword());
			ps.setString(7, u1.getAddress());
			ps.executeUpdate();
			
			con.close();
			System.out.println("Dear, "+u1.getName()+" Congratulations.\nyour Account has been created successfully.\nPlease login to enjoy services.");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
