package composite;

/*
 * Employee definisce un tipo Leaf, con alcune funzioni che non possono essere implementate.
 */
public class Employee implements Department{

	private String name;
	private String surname;
	
	public Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	@Override
	public void print() {
		System.out.println(this.name + " " + this.surname);
	}

	@Override
	public double getExpenditure() {
		return Math.random()*10000;
	}

	@Override
	public void add(Department department) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Department department) {
		throw new UnsupportedOperationException();
	}
	

}
