package game_v1_util;

/**
 * 随机生成属性类
 * @author koupe & meng
 *
 */

public class CreateRandom {
	/**
	 * 根据怪物等级随机生成属性
	 * @param level	等级
	 * @param times	倍率
	 * @param range	浮动范围
	 * @return		生成的属性值
	 */
	public static int CreateRandomMonsterAttributes(int level, int times, int range) {
		int max = (100 + range) * times * level / 100;			//属性上限
		int min = (100 - range) * times * level / 100;			//属性下限
	    long randomNum = System.currentTimeMillis() * (int)(Math.random() * 10 + 1);
	    int result = (int) (randomNum % (max - min) + min);	//随机生成属性值
		return result;
	}
	
	public static int CreatRandomHeroAttributes(int heroType) {
		
		int result = 0;
		return result;
	}
}