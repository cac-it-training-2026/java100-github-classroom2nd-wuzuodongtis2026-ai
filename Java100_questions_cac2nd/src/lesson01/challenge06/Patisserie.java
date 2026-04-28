/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int hino = hi - hibuy;
		int shino = shi - shibuy;
		int pino = pi - pibuy;

		System.out.println("シトロン" + histr + "個");
		System.out.println("ショコラ" + shistr + "個");
		System.out.println("ピスターシュ" + pistr + "個");
		System.out.println("合計個数" + hsp + "個");
		System.out.println("合計金額" + hspq + "円");
		System.out.println("をお買いあげですね");
		System.out.println("承りました。");
		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン       \\250・・・ 残り" + hino + "個");
		System.out.println(" ショコラ      \\280・・・ 残り" + shino + "個");
		System.out.println("ピスターシュ   \\320・・・ 残り" + pino + "個");

	}
}