package strategy;

/*
 * Classe ConcreteStrategy
 */
public class ClassicForPrint implements Printable{

	@Override
	public void print(Sequence<?> sequence) {
		System.out.println("Classic print strategy");
		for(int i = 0; i < sequence.getList().size(); i++) {
			System.out.println(sequence.getList().get(i));
		}
	}

}
