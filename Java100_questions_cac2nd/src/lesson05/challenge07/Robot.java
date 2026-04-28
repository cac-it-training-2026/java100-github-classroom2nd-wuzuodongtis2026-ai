package lesson05.challenge07;

public class Robot {
	int water; // 水

	// 水をランダムに値を送る
	void randomWater() {
		water = (int) (Math.random() * 10) + 1;
	}

	int getWater() {
		// 結果を戻します
		return water;
	}
}
