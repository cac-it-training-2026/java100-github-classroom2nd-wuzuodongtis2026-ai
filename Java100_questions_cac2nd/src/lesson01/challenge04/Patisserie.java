/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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
		//int hibuy = Integer.parseInt(histr);

		System.out.print("ショコラ      >");
		String shistr = reader.readLine();
		//int shibuy = Integer.parseInt(shistr);

		System.out.print("ピスターシュ      >");
		String pistr = reader.readLine();
		//int pibuy = Integer.parseInt(pistr);

		System.out.println("シトロン" + histr + "個");
		System.out.println("ショコラ" + shistr + "個");
		System.out.println("ピスターシュ" + pistr + "個");
		System.out.println("をお買いあげですね");
		System.out.println("承りました。");

	}
}
