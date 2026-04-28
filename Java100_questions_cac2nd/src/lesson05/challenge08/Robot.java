package lesson05.challenge08;

public class Robot {
	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {

		// 条件1：クッキー(小麦粉>=170 且 砂糖>=50 且 卵>=1 且 バター>=80)
		if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			return "クッキー";
		}
		// 条件2：オムレツ (鸡蛋>=2 且 黄油>=5)
		else if (eggNum >= 2 && butterNum >= 5) {
			return "オムレツ";
		}
		// 条件3：　ゆで卵 (鸡蛋>=1)
		else if (eggNum >= 1) {
			return "ゆで卵";
		}
		// 条件4：何も作らない
		else {
			return null; //何もない
		}
	}

}
