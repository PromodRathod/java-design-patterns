package main.structuralDesignPattern.Facade;

public class PushNotification implements ReportGeneration{

	@Override
	public void generatePDFDocument() {
		System.out.println("Generating PDF document for Push Notifications");
	}

	@Override
	public void generateHtmlDocument() {
		System.out.println("Generating Html document for Push Notifications");
	}

}
