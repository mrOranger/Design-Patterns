package factory.applications;

import factory.documents.Document;

public interface Application {
	
	public abstract Document createDocument();
	public abstract void deleteDocument();

}
