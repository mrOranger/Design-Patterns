package factory.applications;

import factory.documents.Document;
import factory.documents.LinuxDocument;

public class LinuxApplication implements Application {
	
	private Document linuxDocument;
	
	public LinuxApplication() {
		this.linuxDocument = new LinuxDocument();
	}

	@Override
	public Document createDocument() {
		return this.linuxDocument;
	}

	@Override
	public void deleteDocument() {
		this.linuxDocument.delete();
	}

}
