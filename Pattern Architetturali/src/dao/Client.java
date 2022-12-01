package dao;

public class Client {
	
	private static StudenteDao dao;
	
	public static void main(String[] args) {
		
		System.out.println("------------SQL------------");
		System.out.println("Stampo tutti gli studenti nel database");
		
		dao = new StudenteDaoRelazionale();
		dao.save(new Studente("Mario", "Rossi"));
		dao.save(new Studente("Federico", "Rossi"));
		dao.save(new Studente("Francesco", "Rossi"));
		
		dao.get().forEach(System.out::println);
		
		System.out.println("Stampo tutti lo studente 2");
		
		System.out.println(dao.get(2));
		
		dao.update(new Studente("Anna", "Verdi"), 1);
		
		System.out.println("Stampo tutti lo studente 1");
		
		System.out.println(dao.get(1));
		
		dao.deleteStudente(1);
		
		System.out.println("Stampo tutti gli studenti nel database");
		dao.get().forEach(System.out::println);
		
		System.out.println("------------No SQL------------");
		
		dao = new StudenteDaoNoRelazionale();
		dao.save(new Studente("Mario", "Rossi"));
		dao.save(new Studente("Federico", "Rossi"));
		dao.save(new Studente("Francesco", "Rossi"));
		
		dao.get().forEach(System.out::println);
		
		System.out.println("Stampo tutti lo studente 2");
		
		System.out.println(dao.get(2));
		
		dao.update(new Studente("Anna", "Verdi"), 1);
		
		System.out.println("Stampo tutti lo studente 1");
		
		System.out.println(dao.get(1));

		dao.deleteStudente(1);
		
		System.out.println("Stampo tutti gli studenti nel database");
		dao.get().forEach(System.out::println);
		
	}

}
