package strategy;

/*
 * Classe ConcreteStrategy
 */
public class StreamPrint implements Printable{

	@Override
	public void print(Sequence<?> sequence) {
		System.out.println("Stream print strategy");
		sequence.getList().stream().forEach(System.out::println);
	}

}
