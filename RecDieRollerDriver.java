/**
 * This is the main method class that will use the recdidroller class to roll a
 * die till a two is reached
 * 
 * @author Chase
 *
 */
public class RecDieRollerDriver {
	/**
	 * Default
	 */
	RecDieRollerDriver() {

	}

	/**
	 * The main method for running the Queue application.
	 *
	 * @param args The command-line arguments (not used in this application).
	 */

	public static void main(String[] args) {
        RecDieRoller roller = new RecDieRoller();
        int totalRolls = 0;
        
        for (int i = 0; i < 1000; i++) {
            int rolls = roller.roll();
            totalRolls += rolls;
        }
        
        double meanRolls = (double) totalRolls / 1000;
        System.out.println("Mean number of die rolls to get a 2: " + meanRolls);
    }// end main

}// end class
