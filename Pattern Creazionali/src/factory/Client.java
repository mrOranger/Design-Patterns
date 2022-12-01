package factory;

import factory.applications.Application;
import factory.applications.LinuxApplication;
import factory.applications.MacApplication;
import factory.applications.WindowsApplication;

public class Client {
	
	private static Application application;
	
	public static void main(String[] args) {
		
		System.out.println("Creating an application for Windows");
		application = new WindowsApplication();
		application.createDocument().open();
		application.deleteDocument();
		System.out.println("-----------------------------------");
		
		System.out.println("Creating an application for Linux");
		application = new LinuxApplication();
		application.createDocument().open();
		application.deleteDocument();
		System.out.println("-----------------------------------");
		
		System.out.println("Creating an application for Mac");
		application = new MacApplication();
		application.createDocument().open();
		application.deleteDocument();
		System.out.println("-----------------------------------");
		
	}
}
