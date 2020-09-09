
public class GamblingSimulation {
	// declare constant variable
	final int STAKE = 100;
	final int BET = 1;
	final int WINING_CASH = 150;
	final int LOOSING_CASH = 50;
	final int NO_OF_DAYS = 20;

	int result;

	public void checkWinLoose() {

		for (int i = 1; i <= NO_OF_DAYS; i++) {
			result = STAKE;
			while ((result != WINING_CASH) && (result != LOOSING_CASH)) {
				int randomCheck = (int) Math.floor(Math.random() * 10) % 2;

				if (randomCheck == 1) {
					result = result + BET;

				} else {
					result = result - BET;
				}

			}

			if (result == WINING_CASH) {
				System.out.println("total Amount won in day:" + i + " amount: " + result);

			} else {
				System.out.println("total amount lost in days:" + i + " amount: " + result);
			}

		}

	}

	public static void main(String[] args) {
		GamblingSimulation obj = new GamblingSimulation();
		obj.checkWinLoose();
	}

}
