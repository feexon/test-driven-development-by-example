import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest{
	
	@Test
	public void testMultiplication(){
		Money five=Money.dollar(5);
		assertEquals(Money.dollar(10),five.times(2));
		assertEquals(Money.dollar(15),five.times(3));
	}

	@Test
	public void testEquality(){
		assertEquals(Money.dollar(5),Money.dollar(5));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD",Money.dollar(5).currency());
		assertEquals("CHF",Money.franc(5).currency());
	}
	
	@Test
	public void testSimpleAddition(){
		Money sum=Money.dollar(5).plus(Money.dollar(5));
		assertEquals(Money.dollar(10),sum);
	}

}
