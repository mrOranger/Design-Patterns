package factory.documents;

public class WindowsDocument implements Document{
	
	@Override
	public void open() {
		System.out.println("Opening a Windows document");
	}

	@Override
	public void close() {
		System.out.println("Closing a Windows document");
	}

	@Override
	public void save() {
		System.out.println("Saving a Windows document");
	}

	@Override
	public void delete() {
		System.out.println("Deleting a Windows document");
	}

}
