import static org.junit.Assert.*;
import org.junit.Test;

public class commandTEST {

	@Test

	public void test() {
		String[] p1 = new String[]{"Add", "Ritika","1234", "4111111111111111" };
		main.addAccount(p1);
		main.creditAmount(p1[1], 300);
		int balance = main.getBalance(p1[1]);
		assertEquals(-300,balance);
		
		main.chargeAmount(p1[1], 200);
		int balance2 = main.getBalance(p1[1]);
		assertEquals(-100,balance2);
	}
}