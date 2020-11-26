package JavaBasics;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/****Varargs****/
		System.out.println("Cases:\n1. Varargs");
		Scanner scan = new Scanner(System.in);
		System.out.print("\nSelect the cases: ");
		int n = scan.nextInt();//
		
		switch(n)
		{
		case 1:	
				System.out.println("******Varargs******");
				Varargs var = new Varargs();
				var.varargsOverload(true, 1,2);
				var.varargsOverload(true, 1,2,3);
				var.varargsOverload(true, 1,2,3,4,5,6);
				var.varargsOverload(true);
				
				break;
		case 2:
				System.out.print("Select ID: ");
				int id = scan.nextInt();
				if(id == 1001)
				{
					Constructors cons = new Constructors(1001,"Varun Saxena", "$80,000");
					System.out.println("ID: "+cons.id+"\n"+"Name: "+cons.name+"\n"+"Salary: "+cons.sal);
					break;
				}
				
				else if(id == 1002) {
					Constructors cons = new Constructors(1002,"Student");
					System.out.println("ID: "+cons.id+"\n"+"Name: "+cons.name);
					break;
				}
				
				else
				{
					System.out.println("select proper id");
					break;
				}
				
		default:
				System.out.println("Check out");
				break;
		}
	}

}
