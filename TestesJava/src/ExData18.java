import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ExData18 {

	public static void main(String[] args) {
		
		Instant dt = Instant.parse("1978-04-24T01:27:47Z");
		DateTimeFormatter dtfDataHoraInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		System.out.println(dtfDataHoraInstant.format(dt));
		
	}

}
