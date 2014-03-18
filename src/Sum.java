public class Sum implements Expression{
	public Money augend;
	public Money addend;

	public Sum(Money augend,Money addend){
		this.augend=augend;
		this.addend=addend;
	}

	public Money reduce(Bank bank,String to){
		Money augend=bank.reduce(this.augend,to);
		Money addend=bank.reduce(this.addend,to);
		return new Money(augend.amount+addend.amount,to);
	}
}
