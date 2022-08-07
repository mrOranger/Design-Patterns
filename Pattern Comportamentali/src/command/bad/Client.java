package command.bad;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		var filiale = new Filiale("Milano");
		var impiegato1 = new Impiegato("Federico", "Rossi", "1");
		var impiegato2 = new Impiegato("Marco", "Verdi", "2");
		var impiegato3 = new Impiegato("Maria", "Rossi", "3");
		filiale.addImpiegato(impiegato1);
		filiale.addImpiegato(impiegato2);
		filiale.addImpiegato(impiegato3);
		
		var manager = new CEO("Andrea", "Neri", "4");
		
		var scanner = new Scanner(System.in);
		System.out.println(filiale.toString());
		System.out.print("Vuoi assumere o licenziare? (a/l) ");
		var input = scanner.nextLine();
		if(input.equals("a")) {
			manager.assumi(filiale, new Impiegato("Francesco", "Gialli", "10"));
		} else {
			manager.licenzia(filiale, impiegato3);
		}
		
		System.out.println(filiale.toString());
		
		var direttore = new Direttore("Giovanni", "Rossi", "8", filiale);
		System.out.println("Però arriva il direttore di turno che licenzia un impiegato...");
		direttore.licenzia(impiegato2);
		
		System.out.println(filiale.toString());
		scanner.close();
		
	}
}
