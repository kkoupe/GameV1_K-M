package game_v1_attributes;

public class Weapon {
	private String name; // ��������
	private String note; // ��������
	private int power; // ����������
	private int magic; // ������ǿ
	private int critDamage; // ���������˺�
	private int critRate; // ����������

	public Weapon(String name, String note, int power, int magic, int critDamage, int critRate) {
		super();
		this.name = name;
		this.note = note;
		this.power = power;
		this.magic = magic;
		this.critDamage = critDamage;
		this.critRate = critRate;
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

	public int getPower() {
		return power;
	}

	private void setPower(int power) {
		this.power = power;
	}

	public int getMagic() {
		return magic;
	}

	private void setMagic(int magic) {
		this.magic = magic;
	}

	public int getCritDamage() {
		return critDamage;
	}

	private void setCritDamage(int critDamage) {
		this.critDamage = critDamage;
	}

	public int getCritRate() {
		return critRate;
	}

	private void setCritRate(int critRate) {
		this.critRate = critRate;
	}

}
