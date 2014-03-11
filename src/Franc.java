public class Franc extends Money{
	private int amount;

	public Franc(int amount){
		this.amount=amount;
	}
	
	public Franc times(int multiplier){
		return new Franc(amount*multiplier);
	}

	public boolean equals(Object that){
		Franc money=(Franc)that;
		return amount==money.amount;
	}

}
