package com.bank.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class Registration {
	
	static int count=1;
	public static User setInfo() {
		Scanner scanner=new Scanner(System.in);
		User user=new User();
		System.out.println("enter details of user "+count);
		
		System.out.println("First name");
		user.setFirstName(scanner.nextLine());
		System.out.println("Last name");
		user.setLastName(scanner.nextLine());
		System.out.println("Aadhar number");
		user.setAadharCardNo(scanner.nextLong());
		System.out.println("Account number");
		user.setAccountNo(scanner.nextLong());
		System.out.println("Account Type");
		user.setAccountType(scanner.next());
		System.out.println("Pancar number");
		user.setPanCard(scanner.next());
		System.out.println("Phone number");
		user.setPhoneNo(scanner.nextLong());
		System.out.println("Address");
		user.setAddress(scanner.next());
		
		count++;
		scanner.close();
		return user;
		
	}

	public static void main(String[] args) {

		ArrayList<User> userdetails=new ArrayList<>();
		userdetails.add(setInfo());
		userdetails.add(setInfo());
		
		try {
			FileOutputStream fileoutput=new FileOutputStream("D:\\program\\userDetails.txt");
			ObjectOutputStream objectouput=new ObjectOutputStream(fileoutput);		
			
			objectouput.writeObject(userdetails);
			objectouput.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
		
	}

}
