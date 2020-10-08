package stack;

class Counter
{
	String str = null;
	int value = 0; 
	Counter(String str)
	{
		this.str = str;
	}
	
	void increment()
	{
		value++;
	}
	
	int getCurrentValue()
	{
		return value;
	}
	
	public String toString()
	{
		return str+ " : "+value;
	}
	
	
}

public class CounterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		myCounter.increment();
		myCounter.getCurrentValue();
		myCounter.toString();
		
		System.out.println(myCounter.getCurrentValue());

	}

}
