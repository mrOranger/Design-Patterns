package bridge;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Con che mano suoni lo strumento? (s/d) ");
		String scelta = scanner.nextLine();
		Configurazione configurazione = null;
		Strumento chitarra = null;
		Strumento sassofono = null;
		if(scelta.equals("s")) {
			configurazione = new ConfigurazioneSx();
			chitarra = new Chitarra(configurazione);
			sassofono = new Sassofono(configurazione);
		} else {
			configurazione = new ConfigurazioneDx();
			chitarra = new Chitarra(configurazione);
			sassofono = new Sassofono(configurazione);
		}
		System.out.println(chitarra.suona());
		System.out.println(sassofono.suona());
		System.out.print("Vuoi cambiare lo strumento? (s/n)");
		String cambio = scanner.nextLine();
		if(cambio.equals("s")){
			if(scelta.equals("s")) {
				configurazione = new ConfigurazioneDx();
			} else {
				configurazione = new ConfigurazioneSx();
			}
			chitarra.setConfigurazione(configurazione);
			sassofono.setConfigurazione(configurazione);
		}
		System.out.println(chitarra.suona());
		System.out.println(sassofono.suona());
		scanner.close();
	}
}
