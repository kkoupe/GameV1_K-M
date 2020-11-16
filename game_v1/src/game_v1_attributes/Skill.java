package game_v1_attributes;

public class Skill {
	private String name; // 技能名称
	private String note; // 技能介绍
	private int expendMp; // 技能消耗法力值

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
