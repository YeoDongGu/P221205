package java4.p63;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();
		rn.setSeed(System.currentTimeMillis());

		for (int i = 0; i < 10; i++) {
			double a = rn.nextDouble();
			System.out.printf("%.3f\n", a * 100);
		}

	}

}
