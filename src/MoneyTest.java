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
		Money five=Money.dollar(5);
		Expression sum=five.plus(five);
		Bank bank=new Bank();
		Money reduced=bank.reduce(sum,"USD");
		assertEquals(Money.dollar(10),reduced);
	}

	@Test
	public void testPlusReturnSum(){
		Money five=Money.dollar(5);
		Money three=Money.dollar(3);
		Sum sum=(Sum)five.plus(three);
		assertEquals(five,sum.augend);
		assertEquals(three,sum.addend);
	}
}
