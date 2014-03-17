public class Money implements Expression{
	protected int amount;
	protected String currency;

	public static Money dollar(int amount){
		return new Money(amount,"USD");
	}

	public static Money franc(int amount){
		return new Money(amount,"CHF");
	}

	public Money(int amount,String currency){
		this.amount=amount;
		this.currency=currency;
	}

	public Expression plus(Money addend){
		return new Sum(this,addend);
	}

	public Money reduce(String currency){
		return this;
	}

	public Money times(int multiplier){
		return new Money(amount*multiplier,currency);
	}

	public String currency(){
		return currency;
	}

	public boolean equals(Object that){
		Money money=(Money)that;
		return amount==money.amount&&currency()==money.currency();
	}

	public String toString(){
		return amount+" "+currency;
	}
}
