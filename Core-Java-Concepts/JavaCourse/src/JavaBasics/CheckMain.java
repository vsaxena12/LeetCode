package JavaBasics;

public class CheckMain {
	/*
	Given two numpy arrays of people and the money they spent, find the people who spent more than 50 dollars.
	people = np.array(["Alice", "Bob", "Catherine", "David", "Esther", "Frank"])
	money_spent = np.array([100, 20, 40, 15, 80, 70])
	*/
	
	// 0 ---- 100
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] people = {"Alice", "Bob", "Catherine", "David", "Esther", "Frank"};
        int[] moneySpent = {100, 20, 40, 15, 80, 70};
        for(int i = 0; i<moneySpent.length; i++)
        {
        	if(moneySpent[i] > 50)
            {
            	System.out.println(people[i] + " "+moneySpent[i]);
            }
        }
	}
}