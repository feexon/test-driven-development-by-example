abstract public class Money{
	protected int amount;

	public static Money dollar(int amount){
		return new Dollar(amount);
	}

	public static Money franc(int amount){
		return new Franc(amount);
	}

	public boolean equals(Object that){
		Money money=(Money)that;
		return amount==money.amount&&getClass()==money.getClass();
	}
	public abstract Money times(int multiplier);

}
