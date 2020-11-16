package game_v1_attributes;

import game_v1_util.CreateRandom;
/**
 * 怪物类
 * (Finished)
 * @author koupe & meng
 *
 */

public class Monster {
	private String name;			// 怪物
	private String note;			// 怪物介绍
	private int hpTotal; 			// 怪物最大血量
	private int hpCurrent; 			// 怪物当前血量
	private int level; 				// 怪物等级
	private int power; 				// 怪物攻击力
	private int defence; 			// 怪物护甲
	private int magicResistance; 	// 怪物魔抗
	private int critRate; 			// 怪物暴击率
	private int critDamage; 		// 怪物暴击伤害
	private int dodgeRate; 			// 怪物闪避率
	private int money; 				// 怪物掉落金币
	private int exp;				// 怪物经验值
	
	@Override
	public String toString() {
		StringBuffer inputMessage = new StringBuffer();
		inputMessage.append("当前怪物信息：\n");
		inputMessage.append("<" + getName() + ">" + "-" + getLevel()+ "级：" + getNote() + "\n");
		inputMessage.append("血量：\t" + getHpTotal() + "\n");
		inputMessage.append("攻击力：" + getPower() + "\n");
		inputMessage.append("护甲:\t" + getDefence() + "\n");
		inputMessage.append("魔抗:\t" + getMagicResistance() + "\n");
		return inputMessage.toString();
	}
	
	public int ran(int range, int  times) {
		int result;
		result = level * times * range;
		return result;
	}
	
	public Monster(String name, String note, int level) {
		super();
		this.name = name;
		this.note = note;
		this.level = level;
		setHpTotal();
		setPower();
		setDefence();
		setMagicResistance();
		setMoney();
		setExp();
		setCritDamage();
		setCritRate();
		setDodgeRate();
		setHpCurrent(getHpTotal());
	}
	public String getName() {
		return name;
	}
	public String getNote() {
		return note;
	}
	public int getHpTotal() {
		return hpTotal;
	}
	private void setHpTotal() {
		this.hpTotal = CreateRandom.CreateRandomMonsterAttributes(this.level, 100, 10);
	}
	public int getHpCurrent() {
		return hpCurrent;
	}
	private void setHpCurrent(int hpCurrent) {
		this.hpCurrent = hpCurrent;
	}
	public int getLevel() {
		return level;
	}
	public int getPower() {
		return power;
	}
	private void setPower() {
		this.power = CreateRandom.CreateRandomMonsterAttributes(this.level, 10, 10);
	}
	public int getDefence() {
		return defence;
	}
	private void setDefence() {
		this.defence = CreateRandom.CreateRandomMonsterAttributes(this.level, 7, 10);
	}
	public int getMagicResistance() {
		return magicResistance;
	}
	private void setMagicResistance() {
		this.magicResistance = CreateRandom.CreateRandomMonsterAttributes(this.level, 7, 10);
	}
	public int getCritRate() {
		return critRate;
	}
	private void setCritRate() {
		this.critRate = this.level / 10 + 1;
	}
	public int getCritDamage() {
		return critDamage;
	}
	private void setCritDamage() {
		this.critRate = 200;
	}
	public int getDodgeRate() {
		return dodgeRate;
	}
	private void setDodgeRate() {
		this.dodgeRate = this.level / 10 + 1;
	}
	public int getMoney() {
		return money;
	}
	private void setMoney() {
		this.money = CreateRandom.CreateRandomMonsterAttributes(this.level, 20, 10);
	}

	public int getExp() {
		return exp;
	}

	private void setExp() {
		this.money = CreateRandom.CreateRandomMonsterAttributes(this.level, 10, 10);
	}
	
}
