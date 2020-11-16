package game_v1_attributes;

import game_v1_util.CreateRandom;
/**
 * ������
 * (Finished)
 * @author koupe & meng
 *
 */

public class Monster {
	private String name;			// ����
	private String note;			// �������
	private int hpTotal; 			// �������Ѫ��
	private int hpCurrent; 			// ���ﵱǰѪ��
	private int level; 				// ����ȼ�
	private int power; 				// ���﹥����
	private int defence; 			// ���ﻤ��
	private int magicResistance; 	// ����ħ��
	private int critRate; 			// ���ﱩ����
	private int critDamage; 		// ���ﱩ���˺�
	private int dodgeRate; 			// ����������
	private int money; 				// ���������
	private int exp;				// ���ﾭ��ֵ
	
	@Override
	public String toString() {
		StringBuffer inputMessage = new StringBuffer();
		inputMessage.append("��ǰ������Ϣ��\n");
		inputMessage.append("<" + getName() + ">" + "-" + getLevel()+ "����" + getNote() + "\n");
		inputMessage.append("Ѫ����\t" + getHpTotal() + "\n");
		inputMessage.append("��������" + getPower() + "\n");
		inputMessage.append("����:\t" + getDefence() + "\n");
		inputMessage.append("ħ��:\t" + getMagicResistance() + "\n");
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
