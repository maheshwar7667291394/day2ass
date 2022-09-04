package question1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		 TreeMap<Employee,Integer> tm=new TreeMap<>();
		 
			
		
		Scanner input=new Scanner(System.in);
		
	   
	    
	    while(true) {
	    	System.out.println("enter id");
	    	int id=input.nextInt();
	    	
	    	System.out.println("Enter name");
	    	String name=input.next();
	    	
	    	System.out.println("Enter address");
	    	String address=input.next();
	    	
	    	System.out.println("Enter salary");
	    	int salary=input.nextInt();
	    	tm.put(new Employee(id, name, address), salary);
	    
//	    	tm.put(emp.salary);
	    	
	    	System.out.println("Want add more Yes/no");
	    	String yn=input.next();
	    	if(!yn.equalsIgnoreCase("yes")) {
	    		break;
	    	}
	    	
	    	
	    }
	    
	    Set<Employee> key=tm.keySet();
	    for(Employee item:key) {
	    	System.out.println(item);
	    }
 	}

}
