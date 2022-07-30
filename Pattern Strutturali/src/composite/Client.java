package composite;

public class Client {
	
	public static void main(String[] args) {
		Department emp1 = new Employee("Mario", "Rossi");
		Department emp2 = new Employee("Maria", "Verdi");
		Department emp3 = new Employee("Francesco", "Neri");
		Department man1 = new Manager("Emanuela", "Bianchi");
		Department team1 = new Team();
		team1.add(emp1);
		team1.add(emp2);
		
		Department team2 = new Team();
		team2.add(emp3);
		team2.add(man1);
		System.out.println("I team registrati sono: ");
		team1.print();
		team2.print();
		
		System.out.println("Il team 1 costa in totale: " + team1.getExpenditure());
		System.out.println("Il team 2 costa in totale: " + team2.getExpenditure());
		
		System.out.println("Aggiungo un nuovo team a quello già presente");
		team1.add(team2);
		team1.print();
		System.out.println("Il team 1 costa in totale: " + team1.getExpenditure());
	}

}
