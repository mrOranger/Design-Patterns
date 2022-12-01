package dao;

import java.util.Collection;
import java.util.LinkedList;

public class StudenteDaoNoRelazionale implements StudenteDao{
	
	private Collection<Studente> studenti = new LinkedList<>();

	@Override
	public Collection<Studente> get() {
		return this.studenti;
	}

	@Override
	public void save(Studente studente) {
		this.studenti.add(studente);
	}

	@Override
	public Studente get(int index) {
		return ((LinkedList<Studente>)this.studenti).get(index);
	}

	@Override
	public Studente update(Studente studente, int index) {
		((LinkedList<Studente>)this.studenti).remove(index);
		((LinkedList<Studente>)this.studenti).add(index, studente);
		return studente;
	}

	@Override
	public void deleteStudente(int index) {
		((LinkedList<Studente>)this.studenti).remove(index);
	}


}
