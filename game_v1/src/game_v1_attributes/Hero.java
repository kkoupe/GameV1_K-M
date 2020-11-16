package game_v1_attributes;
/**
 * 英雄类 - 父类
 * @author koupe & meng
 *
 */

public abstract class Hero {
	private String name; 			// 英雄名称
	private String note; 			// 英雄介绍
	private int hpTotal; 			// 英雄最大血量
	private int hpCurrent; 			// 英雄当前血量
	private int mpTotal; 			// 英雄最大法力值
	private int mpCurrent; 			// 英雄当前法力值
	private int exp; 				// 英雄经验值
	private int level; 				// 英雄等级
	private int power; 				// 英雄攻击力
	private int defence; 			// 英雄护甲
	private int magic; 				// 英雄法强
	private int magicResistance; 	// 英雄魔抗
	private int critRate; 			// 英雄暴击率
	private int critDamage; 		// 英雄暴击伤害
	private Skill[] skillArray; 	// 英雄技能列表
	private int dodgeRate; 			// 英雄闪避率
	private Weapon weapon; 			// 英雄武器
	private Armor armor; 			// 英雄防具
	private int money; 				// 英雄金币

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getHpTotal() {
		return hpTotal;
	}

	public void setHpTotal(int hpTotal) {
		this.hpTotal = hpTotal;
	}

	public int getHpCurrent() {
		return hpCurrent;
	}

	public void setHpCurrent(int hpCurrent) {
		this.hpCurrent = hpCurrent;
	}

	public int getMpTotal() {
		return mpTotal;
	}

	public void setMpTotal(int mpTotal) {
		this.mpTotal = mpTotal;
	}

	public int getMpCurrent() {
		return mpCurrent;
	}

	public void setMpCurrent(int mpCurrent) {
		this.mpCurrent = mpCurrent;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getMagicResistance() {
		return magicResistance;
	}

	public void setMagicResistance(int magicResistance) {
		this.magicResistance = magicResistance;
	}

	public int getCritRate() {
		return critRate;
	}

	public void setCritRate(int critRate) {
		this.critRate = critRate;
	}

	public int getCritDamage() {
		return critDamage;
	}

	public void setCritDamage(int critDamage) {
		this.critDamage = critDamage;
	}

	public Skill[] getSkillArray() {
		return skillArray;
	}

	public void setSkillArray(Skill[] skillArray) {
		this.skillArray = skillArray;
	}

	public int getDodgeRate() {
		return dodgeRate;
	}

	public void setDodgeRate(int dodgeRate) {
		this.dodgeRate = dodgeRate;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
