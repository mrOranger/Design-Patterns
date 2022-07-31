package strategy;

public class Client {
	public static void main(String[] args) {
	
		Sequence<Integer> intSequence = new Sequence<>(new ClassicForPrint());
		intSequence.add(1);
		intSequence.add(2);
		intSequence.add(3);
		intSequence.add(4);
		intSequence.print();
		intSequence.setStrategy(new ForEachPrint());
		intSequence.print();
		intSequence.setStrategy(new IteratorPrint());
		intSequence.print();
		intSequence.setStrategy(new StreamPrint());
		intSequence.print();
	}
}
