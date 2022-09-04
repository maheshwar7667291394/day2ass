package question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mobile {
	
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company, String model) {
		
		
		if(mobiles.containsKey(company)) {
			List<String> modl=mobiles.get(company);
			modl.add(model);
			
		}
		else {
			ArrayList<String> modl=new ArrayList<>();
			modl.add(model);
			mobiles.put(company,modl);
		}
		return "added successfully";
		
	}
	
	public List<String> getModels(String company)throws InvalidMobileException{
		
		if(mobiles.get(company)==null) {
			 InvalidMobileException ae=new InvalidMobileException("company not found");
			 throw ae;
		}
		
		return mobiles.get(company);
		
	}	
	
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		
		Scanner input=new Scanner(System.in);
		 while(true) {
			 System.out.println("Enter company name");
			 String name=input.next();
			 
			 System.out.println("Enter model");
			 String model=input.next();
			 mob.addMobile(name, model);
			 
			 System.out.println("want to add more yes/no");
			 String yn=input.next();
			 if(!yn.equalsIgnoreCase("yes"))
				 break;
			 
			 
		 }
		  System.out.println("enter which comapny model want to see");
		  String cname=input.next();
		  try {
			List<String> mdname=mob.getModels(cname);
			System.out.println(mdname);
		} catch (InvalidMobileException e) {
			  System.out.println(e.getMessage());
			e.printStackTrace();
		}


	}
}
