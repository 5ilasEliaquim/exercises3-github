package entitieslist;

public class Funcionario {

	private int id;
	private String name;
	private double salary;
	
	
	public Funcionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double IncreaseSalary(double increase) {
		return increase = salary * (increase/100);
	}
	
	public String toString() {
		return id + " "
			   + name 
			   + salary;
	
	}
	
	
}
