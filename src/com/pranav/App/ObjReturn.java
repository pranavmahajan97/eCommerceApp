package com.pranav.App;

import java.util.HashMap;
import java.util.Scanner;

public class ObjReturn {
	
	void objRet(int cID, HashMap<Integer, HashMap<Integer, String>> hm)
			{
				HashMap<Integer,String>  bhm = hm.get(cID);
				System.out.println("Which item you want to return");
				Scanner sc = new Scanner(System.in);
				String rq  = sc.nextLine();
				System.out.println("How much quantity you want to return?");
				Scanner sc2 =new Scanner(System.in);
				int rqa = sc2.nextInt();
				if (rq.equalsIgnoreCase("rice") || rq.equalsIgnoreCase("pulses") || rq.equalsIgnoreCase("oil"))
				{
					Snapdeal obj = new Snapdeal();
					obj.ret(rq,rqa);
				}
				else if(rq.equalsIgnoreCase("laptop") || rq.equalsIgnoreCase("tablet") || rq.equalsIgnoreCase("mobile"))
				{
					Amazon obj = new Amazon();
					obj.ret(rq,rqa);
				}
				else if(rq.equalsIgnoreCase("Traditions") || rq.equalsIgnoreCase("Spiritual") || rq.equalsIgnoreCase("scifi"))
				{
					Flipkart obj = new Flipkart();
					obj.ret(rq,rqa);
				}
				
				
			}

}
