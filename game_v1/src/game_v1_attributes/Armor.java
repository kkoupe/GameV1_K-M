package game_v1_attributes;
/**
 * ������
 * @author koupe & meng
 *
 */

public class Armor {
	private String name; // ��������
	private String note; // ���߽���
	private int hp; // ����Ѫ��
	private int defence; // ���߻���
	private int magicResistance; // ����ħ��
	private int dodgeRate; // ����������
	private int critResistance; // ���߿�����

	/**
	 * �Զ��幹�췽��
	 * @param name
	 * @param note
	 * @param hp
	 * @param defence
	 * @param magicResistance
	 * @param dodgeRate
	 * @param critResistance
	 */
	public Armor(String name, String note, int hp, int defence, 
			int magicResistance, int dodgeRate, int critResistance) {
		setName(name);
		setNote(note);
		setHp(hp);
		setDefence(defence);
		setMagicResistance(magicResistance);
		setDodgeRate(dodgeRate);
		setCritResistance(critResistance);
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	private void setNote(String note) {
		this.note = note;
	}

	public int getHp() {
		return hp;
	}

	private void setHp(int hp) {
		this.hp = hp;
	}

	public int getDefence() {
		return defence;
	}

	private void setDefence(int defence) {
		this.defence = defence;
	}

	public int getMagicResistance() {
		return magicResistance;
	}

	private void setMagicResistance(int magicResistance) {
		this.magicResistance = magicResistance;
	}

	public int getDodgeRate() {
		return dodgeRate;
	}

	private void setDodgeRate(int dodgeRate) {
		this.dodgeRate = dodgeRate;
	}

	public int getCritResistance() {
		return critResistance;
	}

	private void setCritResistance(int critResistance) {
		this.critResistance = critResistance;
	}

}
