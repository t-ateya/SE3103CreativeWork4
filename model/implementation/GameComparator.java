package model.implementation;

import java.util.Comparator;

import model.interfaces.IGame;
import model.util.Date;

public class GameComparator implements Comparator<IGame> {

	@Override
	public int compare(IGame game1, IGame game2) {
		if (game1.getDate().compareTo(game2.getDate()) != 0) {
			Date date1 = game1.getDate();
			Date date2 = game2.getDate();
			int result = date1.compareTo(date2);
			return result;

		}
		return game1.getTitle().compareTo(game2.getTitle());
	}

}
