package main.structuralDesignPattern.Facade;

public class EmailNotification implements ReportGeneration{

	@Override
	public void generatePDFDocument() {
		System.out.println("Generating PDF document for Email Notifications");
	}

	@Override
	public void generateHtmlDocument() {
		System.out.println("Generating Html document for Email Notifications");
	}

} 