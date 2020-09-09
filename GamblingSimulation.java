public class GamblingSimulation {
	//declare constant variable
	final int STAKE = 100;
	final int BET = 1;
	final int WINING_CASH = 150;
	final int LOOSING_CASH = 50;
	final int NO_OF_DAYS = 30;

	int winArr[] = new int[NO_OF_DAYS];
	int lostArr[] = new int[NO_OF_DAYS];

	public void checkWinLoose() {

		for (int i = 0; i < NO_OF_DAYS; i++) {
			int winCount = 0;
			int lostCount = 0;
			int result = STAKE;
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
				winArr[i] = winCount;
				System.out.println("total Amount won :" + winCount + " in day: " + (i + 1));
			} else {
				System.out.println("you lost the game");
				lostArr[i] = lostCount;
				System.out.println("total Amount lost: " + lostCount + " in day: " + (i + 1));
			}

		}

		int maxWin = 0;

		int luckyDay = 0;
		for (int i = 0; i < NO_OF_DAYS; i++) {
			if (winArr[i] > maxWin && winArr[i] != 0) {
				maxWin = winArr[i];
				luckyDay = i;
			}
		}

		System.out.println("your lukkiest day:" + (luckyDay + 1));

		int maxLost = 0;

		int unLuckyDay = 0;
		for (int i = 0; i < NO_OF_DAYS; i++) {
			if (lostArr[i] > maxLost && lostArr[i] != 0) {
				maxLost = lostArr[i];
				unLuckyDay = i;
			}
		}

		System.out.println("your unlukkiest day:" + (unLuckyDay + 1));

	}

	public static void main(String[] args) {
		GamblingSimulation obj = new GamblingSimulation();
		obj.checkWinLoose();

	}

}
