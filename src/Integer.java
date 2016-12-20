import java.util.Scanner;
/**
 * Name:Cameron
 * Teacher:Mr.Hardman
 * Assignment 6, Program 3
 * Date last modified:December 9
 */

/**
 * @author c.toy
 *
 */
public class Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		
		System.out.println()
		
		
	}
	
	public static boolean isPrime(int userNumber){
		
		boolean prime = true;

		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){
		
		    /**
		     * Check whether the remainder of userNumber divided by i equals 0.
		     * If so, prime = false;
		     *
		     */
			
			if(userNumber % i == 0){
				
				prime = false;
				
			}
		
		}
		
		return prime;

	}

}
