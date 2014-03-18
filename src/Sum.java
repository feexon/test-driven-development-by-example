public class Sum implements Expression{
	public Expression augend;
	public Expression addend;

	public Sum(Expression augend,Expression addend){
		this.augend=augend;
		this.addend=addend;
	}

	public Money reduce(Bank bank,String to){
		Money augend=bank.reduce(this.augend,to);
		Money addend=bank.reduce(this.addend,to);
		return new Money(augend.amount+addend.amount,to);
	}

	public Expression plus(Expression addend){
		return new Sum(this,addend);
	}

	public Expression times(int multiplier){
		return new Sum(augend.times(multiplier),addend.times(multiplier));
	}
}
