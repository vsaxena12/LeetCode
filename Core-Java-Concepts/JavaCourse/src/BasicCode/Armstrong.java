package BasicCode;
import java.util.Scanner;
public class Armstrong {
	protected void armstrongNumIterative() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n = scan.nextInt();
		int temp = 0, count = 0, check = 0;
		count = n;
		while(n>0) {
			//System.out.println(temp);
			temp = n % 10;
			//System.out.println(n);
			n = n/10;
			//System.out.println(check);
			check = check + (temp*temp*temp);
		}
		if(check == count)
			System.out.println("IsArmstrong");
		else
			System.out.println("IsNotArmstrong");
		
		//scan.close();
	}
}
