package strategy;

import java.util.Iterator;
import java.util.List;

public class IteratorPrint implements Printable{

	@Override
	public void print(List<?> list) {
		System.out.println("Iterator print strategy");
		Iterator<?> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
