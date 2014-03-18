import java.util.Map;
import java.util.HashMap;
public class Bank{

	private class Pair{
		private String from;
		private String to;

		public Pair(String from,String to){
			this.from=from;
			this.to=to;
		}

		public boolean equals(Object that){
			Pair pair=(Pair)that;
			return from.equals(pair.from) && to.equals(pair.to);
		}
		
		public int hashCode(){
			return 0;
		}
	}

	private Map<Pair,Integer> rates=new HashMap<Pair,Integer>();

	public Money reduce(Expression source,String currency){
		return source.reduce(this,currency);
	}

	public void addRate(String from,String to,int rate){
		rates.put(new Pair(from,to),rate);
	}

	public int rate(String from,String to){
		if(from.equals(to)){
			return 1;
		}
		return rates.get(new Pair(from,to));
	}
}
