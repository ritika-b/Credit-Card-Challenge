import static org.junit.Assert.*;
import org.junit.Test;

public class displayTEST {

	@Test

	public void test() {
		String[] p1 = new String[]{"Add", "Ritika", "10", "4111111111111111" };
		main.addAccount(t1);
		String[] p2 = new String[]{"Add", "Jose", "30000", "5454545454545454" };
		main.addAccount(t2);
		String[] p3 = new String[]{"Add", "Andie", "5000", "1234567890123456" };
		main.addAccount(t3);
		
		main.printDisplay();
	}

}