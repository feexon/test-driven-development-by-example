public class Sum implements Expression{
	public Money augend;
	public Money addend;

	public Sum(Money augend,Money addend){
		this.augend=augend;
		this.addend=addend;
	}

	public Money reduce(Bank bank,String currency){
		return new Money(augend.amount+addend.amount,currency);
	}
}
