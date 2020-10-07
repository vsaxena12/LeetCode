package firstDemoProgramJava;



class Casting{
	
	
	
}



public class DataTypes {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c; //ASCII is the subset of Unicode
	boolean bool;
	
	public static void integer()
	{
		System.out.println("Int MAX Value: "+Integer.MAX_VALUE);
		System.out.println("Int MIN Value: "+Integer.MIN_VALUE);
		System.out.println("Int BYTES: "+Integer.BYTES);
	}
	public static void bytes()
	{
		System.out.println("Bytes MAX_VALUE: "+ Byte.MAX_VALUE);
		System.out.println("Bytes MIN_VALUE: "+ Byte.MIN_VALUE);
		System.out.println("Bytes BYTES: "+ Byte.BYTES);
	}
	
	public static void floats()
	{
		System.out.println("Float MAX_VALUE: "+ Float.MAX_VALUE);
		System.out.println("Float MIN_VALUE: "+ Float.MIN_VALUE);
		System.out.println("Float BYTES: "+ Float.BYTES);
	}
	
	public static void main(String args[])
	{
		integer();
		bytes();
		floats();
		int b = (byte)130;//Casting 
		System.out.println(b);
		
		char c = 1;
		System.out.println(c);
	}

}
