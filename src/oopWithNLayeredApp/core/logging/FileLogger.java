package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged to the File : " + data);
		
	}

}
