package factory.applications;

import factory.documents.Document;
import factory.documents.WindowsDocument;

public class WindowsApplication implements Application {
	
	private Document windowsDocument;
	
	public WindowsApplication() {
		this.windowsDocument = new WindowsDocument();
	}

	@Override
	public Document createDocument() {
		return this.windowsDocument;
	}

	@Override
	public void deleteDocument() {
		this.windowsDocument.delete();
	}

}
