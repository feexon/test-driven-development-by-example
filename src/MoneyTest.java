import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest extends ExpressionTest{

	@Test
	public void testMultiplication(){
		assertEquals(Money.dollar(10),fiveBucks.times(2));
		assertEquals(Money.dollar(15),fiveBucks.times(3));
	}

	@Test
	public void testEquality(){
		assertEquals(Money.dollar(5),fiveBucks);
		assertFalse(fiveBucks.equals(Money.dollar(6)));
		assertFalse(fiveBucks.equals(Money.franc(5)));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD",fiveBucks.currency());
		assertEquals("CHF",Money.franc(5).currency());
	}
	
	@Test
	public void testSimpleAddition(){
		Expression sum=fiveBucks.plus(fiveBucks);
		assertEquals(Money.dollar(10),bank.reduce(sum,"USD"));
	}

	@Test
	public void testPlusReturnSum(){
		Money three=Money.dollar(3);
		Sum sum=(Sum)fiveBucks.plus(three);
		assertEquals(fiveBucks,sum.augend);
		assertEquals(three,sum.addend);
	}

	@Test
	public void testReduceMoney(){
		Money reduced=bank.reduce(fiveBucks,"USD");
		assertEquals(fiveBucks,reduced);
	}

	@Test
	public void testReduceMoneyDifferentCurrency(){
		Money twoFrancs=Money.franc(2);
		Money reduced=bank.reduce(twoFrancs,"USD");
		assertEquals(Money.dollar(1),reduced);
	}


	@Test
	public void testMixedAddition(){
		Money reduced=bank.reduce(fiveBucks.plus(tenFrancs),"USD");
		assertEquals(Money.dollar(10),reduced);	
	}
	
}
