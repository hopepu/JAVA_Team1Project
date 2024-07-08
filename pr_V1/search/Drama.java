package pr_V1.search;

public class Drama extends ShowDTO {

	private String romance;
	private String comedy;
	private String action;
	private String sf;
	private String mystery;
	private String fantasy;

	public Drama() {
		// 기본생성자
	}

	public Drama(String program, String category, String title, String director, String actor, String contents) {
		super(program, category, title, director, actor, contents);
	}

	public String getRomance() {
		return romance;
	}

	public String getComedy() {
		return comedy;
	}

	public String getAction() {
		return action;
	}

	public String getSf() {
		return sf;
	}

	public String getMystery() {
		return mystery;
	}

	public String getFantasy() {
		return fantasy;
	}

	public void setRomance() {
		this.romance = "로맨스";
	}

	public void setComedy() {
		this.comedy = "코미디";
	}

	public void setAction() {
		this.action = "액션";
	}

	public void setSf() {
		this.sf = "SF";
	}

	public void setMystery() {
		this.mystery = "미스터리";
	}

	public void setFantasy() {
		this.fantasy = "판타지";
	}

}
