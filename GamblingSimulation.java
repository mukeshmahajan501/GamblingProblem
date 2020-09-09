import java.util.Scanner;

public class GamblingSimulation {

	// constant variable declartion
	final int STAKE = 100;
	final int BET = 1;
	final int NO_OF_DAYS = 30;
	final int WINING_CASH = 150;
	final int LOOSING_CASH = 50;

	// array declaration
	int winArr[] = new int[NO_OF_DAYS];
	int lostArr[] = new int[NO_OF_DAYS];
	int totalAmount = 0;
	int sumOfWinCount = 0;
	int sumOfLostCount = 0;

	// get lukkiest and lukkiest days
	public void getLukyUnlukyDay() {
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
				System.out.println("total Amount won :" + winCount + "in day: " + (i + 1));
			} else {
				System.out.println("you lost the game");
				lostArr[i] = lostCount;
				System.out.println("total Amount lost: " + lostCount + "in day: " + (i + 1));
			}

		}

		int maxWin = 0;

		int luckyDay = 0;
		for (int i = 0; i < NO_OF_DAYS; i++) {
			if (winArr[i] > maxWin && winArr[i] != 0) {
				maxWin = winArr[i];
				luckyDay = i;
				sumOfWinCount = sumOfWinCount + winArr[i];
			}
		}

		System.out.println("your lukkiest day:" + (luckyDay + 1));

		int maxLost = 0;

		int unLuckyDay = 0;
		for (int i = 0; i < NO_OF_DAYS; i++) {
			if (lostArr[i] > maxLost && lostArr[i] != 0) {
				maxLost = lostArr[i];
				unLuckyDay = i;
				sumOfLostCount = sumOfLostCount + lostArr[i];
			}
		}

		System.out.println("your unlukkiest day:" + (unLuckyDay + 1));
		System.out.println();

		totalAmount = sumOfWinCount - sumOfLostCount;

		if (totalAmount > 0) {
			System.out.println("you won the total amount " + totalAmount);
		} else {
			System.out.println("you lost total amount: " + totalAmount);
		}
	}

	public void play() {
		int day = 0;
		while (day != NO_OF_DAYS) {
			Scanner sc = new Scanner(System.in);
			System.out.println("you want to start the game!!:Enter 1");
			System.out.println("you want to exit !!:Enter 2");
			System.out.println("enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				if (totalAmount > 0) {
					totalAmount = 0;
					getLukyUnlukyDay();
				} else {
					System.out.println("stop the game!! you cant play");
					System.exit(0);
				}
				break;

			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("wrong input!!!");
				break;
			}
		}
		day++;

	}

	public static void main(String[] args) {
		GamblingSimulation obj = new GamblingSimulation();
		obj.getLukyUnlukyDay();
		obj.play();

	}

}
