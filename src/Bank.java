public class Bank{
	public Money reduce(Expression source,String currency){
		return source.reduce(currency);
	}

	public void addRate(String from,String to,int rate){
	}
}