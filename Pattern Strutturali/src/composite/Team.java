package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Team implements Department{
	
	private Collection<Department> members;
	
	public Team() {
		this.members = new ArrayList<>();
	}

	@Override
	public void print() {
		System.out.println("Team members: ");
		this.members.forEach((t) -> t.print());
	}

	@Override
	public double getExpenditure() {
		return this.members.stream().mapToDouble((e) -> e.getExpenditure()).sum();
	}

	@Override
	public void add(Department department) {
		this.members.add(department);
	}

	@Override
	public void remove(Department department) {
		this.members.remove(department);
	}
}
