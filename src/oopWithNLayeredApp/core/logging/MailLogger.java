package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged to the Mail : " + data);

		
	}
	

}
