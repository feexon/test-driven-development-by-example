public class Dollar{
	public int amount;

	public Dollar(int amount){
		this.amount=amount;
	}
	
	public Dollar times(int multiplier){
		return new Dollar(amount*multiplier);
	}

	public boolean equals(Object that){
		Dollar money=(Dollar)that;
		return amount==money.amount;
	}

}
