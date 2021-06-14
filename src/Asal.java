
public class Asal {

	public boolean asalMı(int sayi, int i) {
		if (i < sayi) {
			if (sayi % i != 0) {
				return asalMı(sayi, i += 1);
			} else {
				return false;
			}
		}
		return true;
	}
}
