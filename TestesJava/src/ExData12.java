import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExData12 {

	public static void main(String[] args) {
		
		DateTimeFormatter dtDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dt = LocalDateTime.parse("24/04/1978 15:01:27", dtDataBrasil);
		System.out.println(dt);

	}

}
