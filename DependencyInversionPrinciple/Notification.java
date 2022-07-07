package DependencyInversionPrinciple;

public class Notification {
	Email messageObj;

	Notification() {
		messageObj = new Email();
	}

	public void sendNotification() {
		messageObj.sendMessage();
	}
}
