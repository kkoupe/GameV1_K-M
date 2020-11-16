package game_v1_attributes;

public class Skill {
	private String name; // ��������
	private String note; // ���ܽ���
	private int expendMp; // �������ķ���ֵ

	public Skill(String name, String note, int expendMp) {
		super();
		this.name = name;
		this.note = note;
		this.expendMp = expendMp;
	}

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

	public int getExpendMp() {
		return expendMp;
	}

	public void setExpendMp(int expendMp) {
		this.expendMp = expendMp;
	}

}
