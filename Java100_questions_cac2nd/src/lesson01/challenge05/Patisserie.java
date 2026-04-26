/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int hi = 30;
		int shi = 30;
		int pi = 30;

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン       \\250・・・ 残り" + hi + "個");
		System.out.println(" ショコラ      \\280・・・ 残り" + shi + "個");
		System.out.println("ピスターシュ   \\320・・・ 残り" + pi + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか（最大30個数まで）");

		System.out.print("シトロン      >");
		String histr = reader.readLine();
		int hibuy = Integer.parseInt(histr);

		System.out.print("ショコラ      >");
		String shistr = reader.readLine();
		int shibuy = Integer.parseInt(shistr);

		System.out.print("ピスターシュ      >");
		String pistr = reader.readLine();
		int pibuy = Integer.parseInt(pistr);

		int hsp = hibuy + shibuy + pibuy;
		int hspq = (hibuy * 250) + (shibuy * 280) + (pibuy * 320);

		System.out.println("シトロン" + histr + "個");
		System.out.println("ショコラ" + shistr + "個");
		System.out.println("ピスターシュ" + pistr + "個");
		System.out.println("合計個数" + hsp + "個");
		System.out.println("合計金額" + hspq + "円");
		System.out.println("をお買いあげですね");
		System.out.println("承りました。");

	}
}