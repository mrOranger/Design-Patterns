package factory.documents;

public class MacDocument implements Document{
	
	@Override
	public void open() {
		System.out.println("Opening a Max document");
	}

	@Override
	public void close() {
		System.out.println("Closing a Mac document");
	}

	@Override
	public void save() {
		System.out.println("Saving a Mac document");
	}

	@Override
	public void delete() {
		System.out.println("Deleting a Mac document");
	}

}
