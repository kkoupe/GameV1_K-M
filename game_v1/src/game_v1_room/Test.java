package game_v1_room;

import game_v1_util.*;
import game_v1_attributes.*;
import game_v1_biz.*;

public class Test {
	public static void main(String[] args) {
		Monster mon = new Monster("阿聪", "我好久没见过女人了！", 1);
		new Show().showMonster(mon);
	}

}
