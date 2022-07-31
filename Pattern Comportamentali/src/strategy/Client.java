package strategy;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Sequence<Integer> intSequence = new Sequence<>(new ClassicForPrint());
		intSequence.add(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		intSequence.print();
		intSequence.setStrategy(new ForEachPrint());
		intSequence.print();
		intSequence.setStrategy(new IteratorPrint());
		intSequence.print();
		intSequence.setStrategy(new StreamPrint());
		intSequence.print();
	}
}
