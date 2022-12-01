package factory.applications;

import factory.documents.Document;
import factory.documents.MacDocument;

public class MacApplication implements Application{
	
	private Document macDocument;
	
	public MacApplication() {
		this.macDocument = new MacDocument();
	}

	@Override
	public Document createDocument() {
		return this.macDocument;
	}

	@Override
	public void deleteDocument() {
		this.macDocument.delete();
	}

}
