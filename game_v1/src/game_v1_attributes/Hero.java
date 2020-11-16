package game_v1_attributes;
/**
 * Ӣ���� - ����
 * @author koupe & meng
 *
 */

public abstract class Hero {
	private String name; 			// Ӣ������
	private String note; 			// Ӣ�۽���
	private int hpTotal; 			// Ӣ�����Ѫ��
	private int hpCurrent; 			// Ӣ�۵�ǰѪ��
	private int mpTotal; 			// Ӣ�������ֵ
	private int mpCurrent; 			// Ӣ�۵�ǰ����ֵ
	private int exp; 				// Ӣ�۾���ֵ
	private int level; 				// Ӣ�۵ȼ�
	private int power; 				// Ӣ�۹�����
	private int defence; 			// Ӣ�ۻ���
	private int magic; 				// Ӣ�۷�ǿ
	private int magicResistance; 	// Ӣ��ħ��
	private int critRate; 			// Ӣ�۱�����
	private int critDamage; 		// Ӣ�۱����˺�
	private Skill[] skillArray; 	// Ӣ�ۼ����б�
	private int dodgeRate; 			// Ӣ��������
	private Weapon weapon; 			// Ӣ������
	private Armor armor; 			// Ӣ�۷���
	private int money; 				// Ӣ�۽��

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
