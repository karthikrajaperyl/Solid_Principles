package DependencyInversionPrinciple;

public class Email implements IMessage{


	@Override
	public void sendMessage() {
		System.out.println("Hello World");
	}

}

