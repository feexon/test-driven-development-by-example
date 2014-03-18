import org.junit.Before;
abstract public class ExpressionTest{
	protected Money fiveBucks;
	protected Expression tenFrancs;
	protected Bank bank;

	@Before
	public void setUp(){
		fiveBucks=Money.dollar(5);
    tenFrancs=Money.franc(10);
    bank=new Bank();
		bank.addRate("CHF","USD",2);
	}
	
}
