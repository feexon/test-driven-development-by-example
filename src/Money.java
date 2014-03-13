public class Money{
	protected int amount;
	protected String currency;

	public Money(int amount,String currency){
		this.amount=amount;
		this.currency=currency;
	}

	public static Money dollar(int amount){
		return new Money(amount,"USD");
	}

	public static Money franc(int amount){
		return new Money(amount,"CHF");
	}

	public boolean equals(Object that){
		Money money=(Money)that;
		return amount==money.amount&&currency()==money.currency();
	}

	public Money times(int multiplier){
		return new Money(amount*multiplier,currency);
	}

	public String currency(){
		return currency;
	}

	public String toString(){
		return amount+" "+currency;
	}
}
