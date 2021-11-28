import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner dieScanner = new Scanner(System.in);

		System.out.println("Enter user name");
		String username = dieScanner.nextLine();
		System.out.println("Username: " + username);

		Die firstDie = new Die(0);
		Die secondDie = new Die(0);
		Player plyr1 = new Player(username);
		Player plyr2 = new Player("Christian");

		boolean isPlaying = true;
		do {
			System.out.println("press A to start");
			System.out.println("press B to finish");
			String userOption = dieScanner.nextLine();

			switch (userOption) {
			case "A": {
				playGame(plyr1, plyr2, firstDie, secondDie);
			}
			case "B": {
				System.out.println("Exiting game...");
				isPlaying = false;
			}
			}

		} while (isPlaying);

	}

	public static void playGame(Player plyr1, Player plyr2, Die firstDie, Die secondDie) {

		System.out.println("Current player die: " + plyr1.getName() + " " + " current side: " + firstDie.throwDie());

		System.out.println(
				"Current player throwing: " + plyr2.getName() + " " + " current side: " + secondDie.throwDie());

		if (firstDie.getCurrentSide() > secondDie.getCurrentSide()) {
			System.out.println(plyr1.getName() + " WON!");
		} else if (firstDie.getCurrentSide() < secondDie.getCurrentSide()) {
			System.out.println(plyr2.getName() + " WON!");
		} else {
			System.out.println(plyr1.getName() + " and " + plyr2.getName() + " both got same scores! Draw!");

		}

	}
}
