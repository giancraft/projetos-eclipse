import java.time.ZoneId;

public class ExData20 {
	
	public static void main(String[] args) {
		
		ZoneId.getAvailableZoneIds().forEach((String name)	-> {
		System.out.println(name);		
	});

}
}
