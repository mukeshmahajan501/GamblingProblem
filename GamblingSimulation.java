public class GamblingSimulation {
	// declare constant variable
	final int STAKE = 100;
	final int BET = 1;
	final int WINING_CASH = 150;
	final int LOOSING_CASH = 50;
	final int NO_OF_DAYS=30;
	public void checkWinLoose() {

		for (int i = 1; i <= NO_OF_DAYS; i++) {
			int winCount = 0;
			int lostCount = 0;
			int result = STAKE;

			int totalAmount = 0;
			while ((result != WINING_CASH) && (result != LOOSING_CASH)) {
				int randomCheck = (int) Math.floor(Math.random() * 10) % 2;

				if (randomCheck == 1) {
					result = result + BET;
					winCount++;

				} else {
					result = result - BET;
					lostCount++;
				}

			}

			if (result == WINING_CASH) {
				System.out.println("you won the game");
				totalAmount = winCount;
				System.out.println("total Amount won in day:" + i + " Amount:" + totalAmount);

			} else {
				System.out.println("you loose the game");
				totalAmount = lostCount;
				System.out.println("total amount lost in days: " + i + " Amount:" + totalAmount);
			}

		}

	}

	public static void main(String[] args) {
		GamblingSimulation obj = new GamblingSimulation();
		obj.checkWinLoose();
	}

}
