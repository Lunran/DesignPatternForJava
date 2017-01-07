package com.sample;

import com.sample.game.Gamer;
import com.sample.game.Memento;

class Main {

	public static void main(String args[]) {

		Gamer gamer = new Gamer(0);
		Memento memento = gamer.createMemento();

		for (int i=0; i<100; i++) {
			System.out.println(i + "才: " + gamer);

			int result = gamer.throwDice();
			gamer.bet(result);

			if (gamer.getMoney() > 100000000) {
				System.out.println("もう満足したので、やめます。");
				System.exit(0);
			}
			else if (gamer.getMoney() > memento.getMoney() * 2) {
				System.out.println("だいぶ増えたので、現在の状態を保存します。");
				memento = gamer.createMemento();
			}
			else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("だいぶ減ったので、以前の状態を復元します。");
				gamer.restoreMemento(memento);
			}
			else {
				// do nothing
			}
		}

		System.out.println("満足する前に寿命が尽きました。 幸せってなんでしょうね。");
	}

}
