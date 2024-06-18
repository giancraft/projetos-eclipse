import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExData17 {

	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.parse("1978-04-24");
		DateTimeFormatter dtfDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dt.format(dtfDataBrasil));

	}

}
