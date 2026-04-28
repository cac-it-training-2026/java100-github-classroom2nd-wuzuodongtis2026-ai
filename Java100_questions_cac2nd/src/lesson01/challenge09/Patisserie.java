/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("売上の割合");
		System.out.println("売上合計      \\" + (int) hspq);
		System.out.println("内訳");

		int hiPer = (int) ((hibuy * 250) / hspq * 100);
		int shiPer = (int) ((shibuy * 280) / hspq * 100);
		int piPer = (int) ((pibuy * 320) / hspq * 100);

		System.out.println("シトロン      \\" + (int) (hibuy * 250) + "・・・ " + hiPer + "%");
		System.out.println("ショコラ      \\" + (int) (shibuy * 280) + "・・・ " + shiPer + "%");
		System.out.println("ピスターシュ  \\" + (int) (pibuy * 320) + "・・・ " + piPer + "%");

		System.out.println(); // 空白入れる
		System.out.println("明日の三色マカロンの配合率が決まりました！");
		System.out.println();

		System.out.println("シトロンの味    ・・・ " + hiPer + "%");
		System.out.println("ショコラの味    ・・・ " + shiPer + "%");
		System.out.println("ピスターシュの味・・・ " + piPer + "%");

		System.out.println();
		System.out.println("が楽しめます！");
		System.out.println();

		int avgPrice = (int) (hspq / hsp);
		int newPrice = (avgPrice / 10) * 10;

		System.out.println("値段は\\" + newPrice + "です。");
	}
}
