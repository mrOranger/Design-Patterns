package dao;

import java.util.Collection;

public interface StudenteDao {
	
	public Collection<Studente> get();
	public abstract void save(Studente studente);
	public abstract Studente get(int index);
	public abstract Studente update(Studente studente, int index);
	public abstract void deleteStudente(int index);

}
