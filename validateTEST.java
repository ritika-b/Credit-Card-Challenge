import static org.junit.Assert.*;
import org.junit.Test;

public class validateTEST {

	@Test

	public void test() {
		String s1 = "3451237894565678";
		String s2 = "7676767676767676";
		String s3 = "1111111111111111";
		
		System.out.println(main.validateCard(s1)+" " + main.validateCard(s2)+" "+ main.validateCard(s3));
		assertEquals(true,main.validateCard(s1));
		assertEquals(true, main.validateCard(s2));
		assertEquals(false,main.validateCard(s3));
	
	}

}