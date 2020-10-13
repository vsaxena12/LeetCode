package arrayList;
import java.util.ArrayList;

class ArrayListTest
{
	public void testArrayList()
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("1");
		str.add("2");
		str.add("3");
		str.add("4");
		str.add("5");
		
		System.out.print(str);
		str.remove("3"); //Removing Object
		System.out.print(str);
		
		str.add(0,"100");
		System.out.print(str);
		
		str.removeAll(str);
		System.out.println(str);
		
		str.retainAll(str);
		System.out.println(str);
		
	}
}


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Legacy Implementations - 
		 * Generally we avoid these DS because they are
		 * Synchronized 
		 * Vector - ArrayList 
		 * Hash Tables - HashMap 
		 * Stack - ArrayDequeue
		 */
		
		// ---------Methods---------
		//add(index, element) - Element Shift right by one position
		//remove(index) - Element Shift left by one position
		//Contains()
		//indexOf()
		//equals()
		//removeAll()
		//retainAll()
		//size()
		//isEMpty()
		//set() & get()
		//iterator() and listiterator()
		
		ArrayListTest alt = new ArrayListTest();
		alt.testArrayList();
		
		
		
		
		
		

	}

}
