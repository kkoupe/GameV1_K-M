package game_v1_attributes;
/**
 * 坦克英雄类 - 继承英雄父类
 * @author koupe & meng
 *
 */

	public class TankHero extends Hero {
	private int initHp = 250;				//初始血量
	private int initPower = 8;				//初始攻击力
	private int initMp = 100;				//初始法力值
	private int initDefence = 11;			//初始护甲
	private int initMagic = 1;				//初始法强
	private int initMagicResistance = 11;	//初始魔抗
	private int initCritRate = 2;			//暴击率
	private int initCritDamage = 200;		//暴击伤害
	private int initDodgeRate = 1;			//闪避率
	private int hpIncreaseRate;				//血量增长率
	private int powerIncreaseRate;			//攻击力增长率
	private int mpIncreaseRate;				//法力值增长率
	private int defenceIncreaseRate;		//护甲增长率
	private int magicIncreaseRate;			//法强增长率
	private int magicResistanceIncreaseRate;//魔抗增长率
	
}
