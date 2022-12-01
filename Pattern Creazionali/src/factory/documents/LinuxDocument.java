package factory.documents;

public class LinuxDocument implements Document{

	@Override
	public void open() {
		System.out.println("Opening a Linux document");
	}

	@Override
	public void close() {
		System.out.println("Closing a Linux document");
	}

	@Override
	public void save() {
		System.out.println("Saving a Linux document");
	}

	@Override
	public void delete() {
		System.out.println("Deleting a Linux document");
	}

}
