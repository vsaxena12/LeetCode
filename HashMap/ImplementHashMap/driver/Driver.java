package driver;

import maps.Map;
import maps.HashNode;

public class Driver {

	public static void main(String[] args)
	{
		Map<String,Integer>map=new Map<>();
		map.add("this",1 );
		
		System.out.println(map);
		System.out.println(map.remove("this"));
		System.out.println(map.remove("this"));
		
	}

}
