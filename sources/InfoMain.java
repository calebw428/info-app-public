import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class InfoMain {

	public static void main (String[] args) {
		System.out.println("User name:\t" + System.getProperty("user.name"));
		LocalDate ld = LocalDate.now();
		System.out.print("Date:\t\t");
		System.out.println(String.format("%s %d, %d", 
		  ld.getMonth().getDisplayName(TextStyle.FULL, Locale.US), 
		  ld.getDayOfMonth(), 
		  ld.getYear()));
		System.out.println("OS:\t\t" + System.getProperty("os.name"));
	}
}
