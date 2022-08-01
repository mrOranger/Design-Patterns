package strategy;

/*
 * Classe ConcreteStrategy
 */
public class ForEachPrint implements Printable{

	@Override
	public void print(Sequence<?> sequence) {
		System.out.println("For Each print strategy");
		for(Object elem : sequence.getList()) {
			System.out.println(elem);
		}
	}

}
