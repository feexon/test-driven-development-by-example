import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest{
	
	@Test
	public void testMultiplication(){
		Dollar five=new Dollar(5);
		five.times(2);
		assertEquals(10,five.amount);
	}

}
