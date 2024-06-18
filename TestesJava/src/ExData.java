import java.util.Date;
import java.util.Calendar;

public class ExData {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 24);
		calendario.set(Calendar.MONTH, 3);
		calendario.set(Calendar.YEAR, 1978);
		calendario.set(Calendar.HOUR_OF_DAY, 13);
		calendario.set(Calendar.MINUTE, 30);
		calendario.set(Calendar.SECOND, 55);
		Date dt = calendario.getTime();
		System.out.println("Rodrigo nasceu em: " + dt);
		
	}
	
}
