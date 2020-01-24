import static org.junit.Assert.*;
import org.junit.Test;

public class inputTEST {

	@Test
	public void test() {
		
		String l1 = "Add Ritika 4111111111111111 $3560";
		String l2 = "Add Jose 5454545454545454 $2342";
		String l3 = "Add Andie 1234567890123456 $1234";

		String[] p1 = main.parseInput(l1);
		String[] p2 = main.parseInput(l2);
		String[] p3 = main.parseInput(l3);

		String[] a1 = new String[]{"Add", "Ritika", "3560","4111111111111111"};
		assertEquals(a1,p1);
		String[] a2 = new String[]{"Add", "Jose", "2342","5454545454545454"};
		assertEquals(a2,p2);
		String[] a3 = new String[]{"Add", "Andie", "1234","1234567890123456"};
		assertEquals(a3,p3);
			
	}

}