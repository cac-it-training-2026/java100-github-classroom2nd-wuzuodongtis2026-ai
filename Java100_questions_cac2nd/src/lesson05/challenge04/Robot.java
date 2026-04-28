package lesson05.challenge04;

public class Robot {
	int water;

	void pumpWater() {
		//使えると、スクリーンに出る
		int water = (int) (Math.random() * 10) + 1;

		System.out.println("水を" + water + "リットル出します\n");
	}

}
