import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BankTest{
	
	@Test
	public void testIdentityRate(){
		assertEquals(1,new Bank().rate("USD","USD"));
	}
}
