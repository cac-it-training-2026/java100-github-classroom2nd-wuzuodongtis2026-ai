/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 */

package lesson01.challenge08;

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
		System.out.println("売上合計      \\(int) hspq");
		System.out.println("内訳");
		System.out.println("シトロン      \\" + (int) (hibuy * 250) + "・・・ " + (int) ((hibuy * 250) / hspq * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (shibuy * 280) + "・・・ " + (int) ((shibuy * 280) / hspq * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (pibuy * 320) + "・・・ " + (int) ((pibuy * 320) / hspq * 100) + "%");

	}

}
