package abstractFactory;

import java.util.Scanner;

/*
 * La classe client non è a conoscenza dei prodotti concreti IPad, MicrosoftTablet ...
 * ma interagisce con loro solamente con i medodi astratti creaComputer() e creaTablet(),
 * resituiti dalle ConcreteFactory MicrosoftFactory e AppleFactory.
 */
public class Client {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Che tipo di prodotto vuoi creare? (Apple/Microsoft) ");
			String scelta = scanner.nextLine();
			AbstractFactory factory = null;
			if(scelta.toLowerCase().equals("microsoft")) {
				factory = new MicrosoftFactory();
				factory.creaComputer().crea();
				factory.creaTablet().crea();
			} 
			if(scelta.toLowerCase().equals("apple")) {
				factory = new AppleFactory();
				factory.creaComputer().crea();
				factory.creaTablet().crea();
			}
			
		}
	}

}
