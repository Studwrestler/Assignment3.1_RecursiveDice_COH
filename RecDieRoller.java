import java.util.Random;

/**
 * This a dice rolling class that will roll a dice until it gets a two
 * 
 * @author Chase 10-5-23
 */
public class RecDieRoller {
	private Random r = new Random();// Will be used to generate a random number 1 through 6 to represent a die

	/**
	 * This is the roll method that will roll a die until a two is reached
	 */
	 public int roll() {
	        int rolls = 0;
	        
	        while (true) {
	            int result = r.nextInt(6) + 1;
	            rolls++;
	            
	            System.out.println("Rolled: " + result);
	            
	            if (result == 2) {
	                return rolls;
	            }
	        }
	    }
// end roll

}// end class
