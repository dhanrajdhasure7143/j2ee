package ddh_bank;
import java.util.*;

public class mainscreen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("\t   DDH^ BANK");
		System.out.println("------------------------------");
		System.out.println("\nWelcome to the world of Secure Banking\nThe DDH Banking...\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		while (true) {
			System.out.println("\nPlease choose the Below options : \n");
			System.out.println("1 for Login");
			System.out.println("2 to Create a Account");
			System.out.println("3 to Contact Us.");
			int op1=sc.nextInt();
			if (op1==1) {
				System.out.println("\nLogin :");
				System.out.println("------");
				System.out.println("Enter Username : ");
				String un=sc.next();
				System.out.println("Enter Password : ");
				String pw=sc.next();
				
				login l1=new login(un,pw);
				l1.menu();
			} 
			else if(op1==2) {
				System.out.println("thank you for choosing us..\n");
				System.out.println("please fill all the details below.");
				System.out.println("\t Register\n----------------------------");
				register r1=new register();
				
				System.out.println("Enter username :");
				String un=sc.next();
				System.out.println("Enter Name :");
				String name=sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter Mobile No :");
				String mobno=sc.next();
				System.out.println("Enter Email :");
				String mail=sc.next();
				System.out.println("Enter Gender :");
				String gender=sc.next();
				System.out.println("Enter password ( min 8 digits) :");
				String pass=sc.next();
				System.out.println("Enter permanent Address :");
				String add=sc.next();
				
				r1.setUsername(un);
				r1.setName(name);
				r1.setMobno(mobno);
				r1.setEmail(mail);
				r1.setGender(gender);
				r1.setPassword(pass);
				r1.setAddress(add);
				
				register_dao.insert(r1);
				
			}
			else if(op1==3) {
				System.out.println("Our Contact Details :\n");
				System.out.println("The DDH BANK,");
				System.out.println("Phone No : 123-123\nEmail : contact@ddhbank.com\nAddress : 213, Max Mall, Chaitanyaputi,\n\t  Dilsukhnagar- Hyderabad 500060.\n__________________________________");
			}
			else
			{
				System.out.println("Oops. please choose the correct option.");
				
			}
			
			
			


		}
	}

}
