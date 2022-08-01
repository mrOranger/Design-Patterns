package decorator.badCode;

/*
 * Un esempio di perchè vale la pena usare il pattern Decorator invece che il classico
 * modello basato sull'ereditarietà e dato dalla mole di classi che si vengono a creare
 * quando si cercano di comporre in un oggetto diversi elementi "decorativi"
 * e che risultano essere opzionali.
*/
public class Client {
	public static void main(String[] args) {
		Vehicle car = new CarWithSpoilerAndMuffler();
		car.start();
	}
}
