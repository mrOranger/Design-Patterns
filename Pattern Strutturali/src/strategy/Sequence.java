package strategy;

import java.util.ArrayList;
import java.util.List;

public class Sequence<T> {
	
	private List<T> list;
	private Printable printStrategy;
	
	public Sequence(Printable printStrategy) {
		this.list = new ArrayList<>();
		this.printStrategy = printStrategy;
	}
	
	public void setStrategy(Printable printStrategy) {
		this.printStrategy = printStrategy;
	}
	
	public void add(T elem) {
		this.list.add(elem);
	}
	
	public void print() {
		this.printStrategy.print(list);
	}
}
