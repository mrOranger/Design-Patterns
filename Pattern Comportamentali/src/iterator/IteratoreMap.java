package iterator;

import java.util.Map;

public class IteratoreMap<K, V> implements Iteratore<V>{
	
	private Map<K, V> mappa;
	private short index;
	
	public IteratoreMap(Map<K, V> mappa) {
		this.mappa = mappa;
		this.index = 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public V getFirst() {
		if (mappa.size() > 0) {
			return (V) mappa.values().toArray()[0];
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public V getNext() {
		if (this.index < this.mappa.size()) {
			return (V) mappa.values().toArray()[this.index++];
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return (mappa.values().size() > this.index);
	}
}
