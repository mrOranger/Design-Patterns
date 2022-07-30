package composite;

public interface Department {
	public abstract void print();
	public abstract double getExpenditure();
	public abstract void add(Department department);
	public abstract void remove(Department department);
}
