import org.junit.Test;
import static org.junit.Assert.*;

public class SumTest extends ExpressionTest{

	@Test
	public void reduce(){
		Sum sum=new Sum(fiveBucks,Money.dollar(3));
		assertEquals(Money.dollar(8),bank.reduce(sum,"USD"));
	}

	@Test
	public void plus(){
		Expression sum=new Sum(fiveBucks,tenFrancs).plus(fiveBucks);
		assertEquals(Money.dollar(15),bank.reduce(sum,"USD"));	
	}
	
	@Test
	public void times(){
		Sum sum=new Sum(fiveBucks,tenFrancs);
		assertEquals(Money.dollar(20),bank.reduce(sum.times(2),"USD"));
	}
}
