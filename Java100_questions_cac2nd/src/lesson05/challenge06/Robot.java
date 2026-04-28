package lesson05.challenge06;

public class Robot {

	void makeOmelet(int eggNum, int butterNum) {
		// エッグいくつ作れるかを計算
		int portionsByEgg = eggNum / 2;

		// バターいくつ作れるかを計算
		int portionsByButter = butterNum / 5;

		// 比較し、一番少なめのは個数となる
		int finalPortions;
		if (portionsByEgg < portionsByButter) {
			finalPortions = portionsByEgg;
		} else {
			finalPortions = portionsByButter;
		}

		//計算を出す
		System.out.println("\n" + finalPortions + "人分のオムレツを作成しました。\n");
	}

}
