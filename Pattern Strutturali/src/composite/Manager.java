package composite;

public class Manager implements Department{
	
	private String name;
	private String surname;
	
	public Manager(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	@Override
	public void print() {
		System.out.println(this.name + " " + this.surname);
	}

	@Override
	public double getExpenditure() {
		return Math.random()*20000;
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
