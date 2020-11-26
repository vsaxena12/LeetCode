package HashTables;
import java.util.HashMap;
public class MainHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> pair = new HashMap<Integer,String>();
		pair.put(23, "Varun");
		pair.put(2, "Sandy");
		pair.put(44, "Supsy");
		pair.put(13, "Aranta");
		pair.put(34, "Bawkar");
		pair.put(24, "Anand");
		pair.put(3, "Vidhi");
		//System.out.println(pair);
		for(Integer i : pair.keySet()) {
			if(i > 20) {
				System.out.println(pair.keySet());
			}
		}
	}

}
