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
		System.out.println("OS name:\t" + System.getProperty("os.name"));
		System.out.println("OS version:\t" + System.getProperty("os.version"));
		System.out.println("OS arch:\t" + System.getProperty("os.arch"));
		System.out.println("Java version:\t" + System.getProperty("java.version"));
		System.out.println("Java vendor:\t" + System.getProperty("java.vendor"));
		
	}
}
