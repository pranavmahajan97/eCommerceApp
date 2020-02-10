package com.pranav.App;

import java.util.HashMap;
import java.util.Scanner;

public class appExecutor {
	static int totalUsers=0;
	public static void main(String[] args) {
		HashMap<Integer, String> bhm = new HashMap<>(); 
		HashMap<Integer,HashMap<Integer,String>> hm = new HashMap<>();
		System.out.println("Hi!, Welcome!! How Can I Help You Today?");
		boolean con = true;
		while(con)
		{
		System.out.println("1. User Creation  - U ");
		System.out.println("2. Purchase Product - P");
		System.out.println("3. Return Product - X");
		System.out.println("4. Reports - R");
		System.out.println("5. Exit - E");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		
		switch(input)
		{
		case "u":
		{	
			createUser();
			break;
		}
		case "e":{
			con=false;
			break;
		}
		case "p":
		{
			System.out.println("Enter your user ID :");
			Scanner sc5 = new Scanner(System.in);
			int uID = sc5.nextInt();
			if(uID>totalUsers)
			{
				System.out.println("User does not exist");
			}
			else
			{
				hm = purchase(uID, hm);
			}
			break;
		}
		case "x":
		{
			System.out.println("Enter customer ID");
			Scanner sc6 = new Scanner(System.in);
			int rID = sc6.nextInt();
			ObjReturn obj = new ObjReturn();
			obj.objRet(rID, hm);
			break;
		}
		case "r":
		{
			System.out.println("total users" + totalUsers);
			System.out.println();
			report rp = new report();
			rp.repo();
		}
		}
			
		}
	}

	private static void createUser() {
		System.out.println("Enter your name : ");
		Scanner sc2 = new Scanner(System.in);
		String name = sc2.nextLine();
		System.out.println("Enter your contact no.");
		long contact = sc2.nextLong();
		System.out.println("Enter your e-mail ID : ");
		Scanner sc3 = new Scanner(System.in);
		String email = sc3.nextLine();
		totalUsers++;
		int uID  = totalUsers;
		System.out.println("Your user ID is : " + uID);
	}

	private static HashMap<Integer, HashMap<Integer, String>> purchase(int uID, HashMap<Integer, HashMap<Integer, String>> hm) {
		System.out.println("From which website you want to purchase products?");
		Scanner sc4 = new Scanner(System.in);
		String web = sc4.nextLine();
		if(web.equalsIgnoreCase("amazon"))
		{
			Amazon obj = new Amazon();
			hm = obj.purchase(uID, hm);
		}
		else if(web.equalsIgnoreCase("flipkart"))
		{
			Flipkart obj = new Flipkart();
			hm = obj.purchase(uID, hm);
		}
		else if(web.equalsIgnoreCase("snapdeal"))
		{
			Snapdeal obj = new Snapdeal();
			hm = obj.purchase(uID, hm);
		}
	return hm;

	

	
	}
}
