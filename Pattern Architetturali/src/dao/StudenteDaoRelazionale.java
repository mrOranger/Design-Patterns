package dao;

import java.util.ArrayList;
import java.util.Collection;

public class StudenteDaoRelazionale implements StudenteDao{
	
	private Collection<Studente> studenti = new ArrayList<>();

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
		return ((ArrayList<Studente>)this.studenti).get(index);
	}

	@Override
	public Studente update(Studente studente, int index) {
		final Studente oldStudente = ((ArrayList<Studente>)this.studenti).get(index);
		oldStudente.setName(studente.getName());
		oldStudente.setSurname(studente.getSurname());
		return oldStudente;
	}

	@Override
	public void deleteStudente(int index) {
		this.studenti.remove(((ArrayList<Studente>)this.studenti).get(index));
	}

}
