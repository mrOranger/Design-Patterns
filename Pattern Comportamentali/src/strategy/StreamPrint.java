package strategy;

import java.util.List;

public class StreamPrint implements Printable{

	@Override
	public void print(List<?> list) {
		System.out.println("Stream print strategy");
		list.stream().forEach(System.out::println);
	}

}
