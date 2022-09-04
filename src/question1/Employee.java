package question1;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String address;
	
	public Employee() {}

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee o) {
	   String name1=this.name;
	   String name2=o.name;
	   if(name1.compareTo(name2)>0) {
		   return +1;
	   }
	   else if(name1.compareTo(name2)<0) {
		   return -1;
	   }
		return 0;
	}
	
	
	

}
