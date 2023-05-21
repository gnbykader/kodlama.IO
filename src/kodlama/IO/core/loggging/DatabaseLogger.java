package kodlama.IO.core.loggging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("veritabanina gonderildi: " + data);
		
	}

}
