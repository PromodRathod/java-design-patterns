package main.structuralDesignPattern.Facade;

public class NotificationReportFacade {

	public static void generateNotificationReport(NotificationType nType, ReportType rType) {
		ReportGeneration rG = null;
		switch(nType) {
		case EMAIL : rG = new EmailNotification();
				     break;
		case PUSH : rG = new PushNotification();
					break;
		default : System.err.println("Invalid Notification Type!!");
		}
		if (rG != null) {
			if (rType.equals(ReportType.PDF)) rG.generatePDFDocument(); 
		    else if (rType.equals(ReportType.HTML)) rG.generateHtmlDocument();
		    else System.err.println("Invalid Report Type!!");
		}
	}
	
	public static enum NotificationType {
		EMAIL, PUSH
	}
	
	public static enum ReportType {
		PDF, HTML
	}
}
