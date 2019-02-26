package deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class RetrieveUser {

	public static void getInfo(User user) {
		
		
		System.out.println("Details of user are: ");
		
		System.out.println("First name : "+user.getFirstName());
		
		System.out.println("Last name : "+user.getLastName());
		
		System.out.println("Aadhar number : "+user.getAadharCardNo());
		
		System.out.println("Account number : "+user.getAccountNo());
		
		System.out.println("Account Type : "+user.getAccountType());

		System.out.println("Pancar number : "+user.getPanCard());
	
		System.out.println("Phone number : "+user.getPhoneNo());
	
		System.out.println("Address : "+user.getAddress());
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scanner=new Scanner(System.in);
	
		try {
			FileInputStream fileinput =new FileInputStream("D:\\program\\userDetails.txt");
			ObjectInputStream object=new ObjectInputStream(fileinput);
			
			ArrayList<User> userdetail= (ArrayList<User>) object.readObject();
			int i=1;
			System.out.println("Enter the User number ");
			i=scanner.nextInt();
			System.out.println("User"+i+"Details are");
			getInfo(userdetail.get(i-1));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
