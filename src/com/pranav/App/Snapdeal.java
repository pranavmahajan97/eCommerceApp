package com.pranav.App;

import java.util.HashMap;
import java.util.Scanner;

public class Snapdeal {
	static String s[]  = {"Rice", "Pulses", "Oil"};
	static int p[] = {400,200,125};	
	static int q[] = {50,200,500};
	HashMap<Integer, HashMap<Integer, String>> purchase(int cID, HashMap<Integer,HashMap<Integer,String>> hm)
	{
	System.out.println("Which groceries do you want to buy from Snapdeal");
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	int x=Integer.MIN_VALUE;
	Scanner sc = new Scanner(System.in);
	String amzIp = sc.nextLine();
	for(int i=0;i<s.length;i++)
	{
		if(amzIp.equalsIgnoreCase(s[i]))
		{
			x=i;
			break;
		}
	}
	System.out.println("How many " + s[x] +" you want to buy?");
	Scanner sc2 = new Scanner(System.in);
	int quan = sc.nextInt();
	int cost=0;
	if(quan>q[x])
	{
		System.out.println("Sorry this much quantity is not available");
	}
	else
	{
		HashMap<Integer, String> bhm = new HashMap<>();
		q[x] = q[x]-quan;
		System.out.println(q[x]);
		cost = p[x]*quan;
		System.out.println("Thankyou for purchasing. This will cost you Rs." + cost);
		bhm.put(quan, s[x]);
		hm.put(cID, bhm);
	}
	return hm;
	


}
	public void ret(String rq, int rqa) {
		int x=0;
		for(int i=0;i<3;i++)
		{
			if(s[i].equalsIgnoreCase(rq))
			{
				q[i]=q[i]+rqa;
				x=i;
			}
			System.out.println("You will be refunded " + (0.75*rqa*p[x]));
		}		
	}
	public void getRec3() {
		for(int i=0;i<3;i++)
		{
		System.out.println(s[i]+" "+ q[i]);
	}		
	}
	
}
