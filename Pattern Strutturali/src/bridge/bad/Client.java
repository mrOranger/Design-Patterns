package bridge.bad;

import java.util.Scanner;

/*
 * Nell'esempio "classico" ogni volta che dobbiamo cambiare strumento
 * bisogna istanziare un nuovo oggetto, oltre al fatto che se volessimo creare un nuovo strumento
 * dovremmo creare un nuovo StrumentoNuovoSx e StrumentoNuovoDx, mentre nell'applicazione del bridge
 * dovremmo solamente creare la classe StrumentoNuovo.
 */
public class Client {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Con che mano suoni lo strumento? (s/d) ");
		String scelta = scanner.nextLine();
		Strumento chitarra = null;
		Strumento sassofono = null;
		if(scelta.equals("s")) {
			chitarra = new ChitarraSx();
			sassofono = new SassofonoSx();
		} else {
			chitarra = new ChitarraDx();
			sassofono = new SassofonoDx();
		}
		System.out.println(chitarra.suona());
		System.out.println(sassofono.suona());
		System.out.print("Vuoi cambiare lo strumento? (s/n)");
		String cambio = scanner.nextLine();
		if(cambio.equals("s")){
			if(scelta.equals("s")) {
				chitarra = new ChitarraDx();
				sassofono = new SassofonoDx();
			} else {
				chitarra = new ChitarraSx();
				sassofono = new SassofonoSx();
			}
		}
		System.out.println(chitarra.suona());
		System.out.println(sassofono.suona());
		scanner.close();
	}

}
