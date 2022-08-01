package strategy;

import java.util.Iterator;

/*
 * Classe ConcreteStrategy
 */
public class IteratorPrint implements Printable{

	@Override
	public void print(Sequence<?> sequence) {
		System.out.println("Iterator print strategy");
		Iterator<?> iterator = sequence.getList().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
