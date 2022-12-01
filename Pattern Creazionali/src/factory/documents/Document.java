package factory.documents;

public interface Document {
	
	public abstract void open();
	public abstract void close();
	public abstract void save();
	public abstract void delete();

}
