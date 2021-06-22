package Homework38;

public class Main {

	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
		Fighter alex = new Fighter("Alex", 10, 95, 100, 0);

		if (randomStart(marc, alex).equals(marc)) {
			Ring r = new Ring(alex, marc, 90, 100);
			r.run();
			r.printScore();

		} else {
			Ring ring = new Ring(marc, alex, 90, 100);
			ring.run();
			ring.printScore();
		}
	}

	// homework added
	static Fighter randomStart(Fighter f1, Fighter f2) {
		int result = (int) (Math.random() * 2); // decide which fighter to start
		Fighter fighterResult = result == 0 ? f1 : f2;
		return fighterResult;

	}
}
