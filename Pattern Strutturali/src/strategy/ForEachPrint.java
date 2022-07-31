package strategy;

import java.util.List;

public class ForEachPrint implements Printable{

	@Override
	public void print(List<?> list) {
		System.out.println("For Each print strategy");
		for(Object elem : list) {
			System.out.println(elem);
		}
	}

}
