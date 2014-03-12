public class Money{
	protected int amount;

	public boolean equals(Object that){
		Money money=(Money)that;
		return amount==money.amount&&getClass()==money.getClass();
	}

}
