
public class Main {

	public static void main(String[] args) {
		System.out.println("first workshop");
		Asal asal = new Asal();
		System.out.println(asal.asalMı(13, 2));
		String str = "123";
		int temp = Integer.valueOf(str);
		System.out.println(temp);
		// dinamik değişen türü kullanımı
		System.out.println("------------------");

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

}
