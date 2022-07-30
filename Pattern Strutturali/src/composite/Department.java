package composite;

/*
 * L'interfaccia Department definisce il Component,
 * quindi i metodi standard che un tipo Composite o Leaf devono esporre.
 */
public interface Department {
	public abstract void print();
	public abstract double getExpenditure();
	public abstract void add(Department department);
	public abstract void remove(Department department);
}
