abstract public class Money{
	protected int amount;
	protected String currency;

	public Money(int amount,String currency){
		this.amount=amount;
		this.currency=currency;
	}

	public static Money dollar(int amount){
		return new Dollar(amount,"USD");
	}

	public static Money franc(int amount){
		return new Franc(amount,"CHF");
	}

	public boolean equals(Object that){
		Money money=(Money)that;
		return amount==money.amount&&getClass()==money.getClass();
	}
	public abstract Money times(int multiplier);

	public String currency(){
		return currency;
	}
}
