package main.structuralDesignPattern.Facade;

import main.structuralDesignPattern.Facade.NotificationReportFacade.NotificationType;
import main.structuralDesignPattern.Facade.NotificationReportFacade.ReportType;

public class FacadeMain {

	public static void main(String[] args) {
		NotificationReportFacade.generateNotificationReport(NotificationType.EMAIL, ReportType.PDF);
		NotificationReportFacade.generateNotificationReport(NotificationType.EMAIL, ReportType.HTML);
		NotificationReportFacade.generateNotificationReport(NotificationType.PUSH, ReportType.PDF);
		NotificationReportFacade.generateNotificationReport(NotificationType.PUSH, ReportType.HTML);
	}
}
