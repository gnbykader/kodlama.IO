package kodlama.IO.core.loggging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("dosyaya gonderildi: " + data);
		
	}

}
