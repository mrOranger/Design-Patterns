package strategy;

import java.util.List;

public class ClassicForPrint implements Printable{

	@Override
	public void print(List<?> list) {
		System.out.println("Classic print strategy");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
