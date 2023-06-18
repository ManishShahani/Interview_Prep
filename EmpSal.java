import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSal {
	public static void main(String[] args) {
		E e = new E (10000, "M", "DeptA" );
		E e1 = new E (20000, "R", "DeptA" );
		E e2=new E (10000, "H", "DeptB" );
		E e3=new E (10000, "M", "DeptB" );
		E e4=new E (10000, "D", "DeptB" );
		E e5=new E (10000, "V", "DeptA" );
		
		List<E> l = new ArrayList<>();
		l.add(e5);
		l.add(e4);
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		  Object a = l.stream().collect(Collectors.groupingBy(E::getDept,Collectors.summingDouble(E::getSalary)));
		  System.out.println(a);
		  
		 

		
	}
}
class E {
	private int salary;
	private String name;
	private String dept;
	
	
	public E(int salary, String name, String dept) {
		super();
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
