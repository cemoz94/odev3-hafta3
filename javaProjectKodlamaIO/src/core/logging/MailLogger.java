package core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("E-posta olarak gönderilmiştir : " + data);
		
	}

}
