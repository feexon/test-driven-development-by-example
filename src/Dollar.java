public class Dollar extends Money{
	
	public Dollar(int amount,String currency){
		this.amount=amount;
		this.currency=currency;
	}
	
	public Money times(int multiplier){
		return dollar(amount*multiplier);
	}
	
}

