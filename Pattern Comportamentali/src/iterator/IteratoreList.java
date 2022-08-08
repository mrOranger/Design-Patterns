package iterator;

import java.util.List;

public class IteratoreList<T> implements Iteratore<T>{
	
	private List<T> list;
	private short index;
	
	public IteratoreList(List<T> list) {
		this.list = list;
		this.index = 0;
	}

	@Override
	public T getFirst() {
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public T getNext() {
		if (this.index < this.list.size()) {
			return this.list.get(this.index++);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return (this.index < this.list.size());
	}
}
