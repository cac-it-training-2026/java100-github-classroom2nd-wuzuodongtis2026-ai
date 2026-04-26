/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double hibuy = Double.parseDouble(histr);

		System.out.print("ショコラ      >");
		String shistr = reader.readLine();
		double shibuy = Double.parseDouble(shistr);

		System.out.print("ピスターシュ      >");
		String pistr = reader.readLine();
		double pibuy = Double.parseDouble(pistr);

		double hsp = hibuy + shibuy + pibuy;
		double hspq = (hibuy * 250) + (shibuy * 280) + (pibuy * 320);
		double hino = hi - hibuy;
		double shino = shi - shibuy;
		double pino = pi - pibuy;

		System.out.println("シトロン" + histr + "個");
		System.out.println("ショコラ" + shistr + "個");
		System.out.println("ピスターシュ" + pistr + "個");
		System.out.println("合計個数" + (int) hsp + "個");
		System.out.println("合計金額" + (int) hspq + "円");
		System.out.println("をお買いあげですね");
		System.out.println("承りました。");
		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン       \\250・・・ 残り" + (int) (hi - hibuy) + "個");
		System.out.println(" ショコラ      \\280・・・ 残り" + (int) (shi - shibuy) + "個");
		System.out.println("ピスターシュ   \\320・・・ 残り" + (int) (pi - pibuy) + "個");
	}
}