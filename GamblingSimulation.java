public class GamblingSimulation {
	// declare constant variable
	final int STAKE_AMOUNT = 100;
	final int BET_AMOUNT = 1;
	final int WINING_CASH = 150;
	final int LOOSING_CASH = 50;

	int result = STAKE_AMOUNT;

	// Gambling won or lost on 50% of stake
	public void checkWinLoose() {
		while (result != WINING_CASH && result != LOOSING_CASH) {

			// to get random number between 0 or 1.
			int bettingResult = (int) (Math.floor(Math.random() * 10) % 2);
			if (bettingResult == 1) {
				result = result + BET_AMOUNT;
			} else {
				result = result - BET_AMOUNT;
			}

		}

		if (result == WINING_CASH) {
			System.out.println("you won the game");
			System.out.println("stake: " + result);
		} else {
			System.out.println("you loose the game");
			System.out.println("stake: " + result);
		}

	}

	public static void main(String args[]) {

		GamblingSimulation gs = new GamblingSimulation();
		gs.checkWinLoose();
	}

}
