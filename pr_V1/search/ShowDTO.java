package pr_V1.search;

public class ShowDTO {
	// 필드

	// Scanner s = 짧은거 입력받을 때 사용
	// Scanner sL = nextLine 용

	private String title;
	private String contents; // 내용설명
	private String program; // 프로그램 종류
	private String category; // 장르종류
	private String director;
	private String actor;
	private boolean netflix;
	private boolean tVing;

	// 생성자
	public ShowDTO() {
		// 기본생성자
	}

	public ShowDTO(String program, String category, String title, String director, String actor, String contents) {
		this.program = program;
		this.category = category;
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.contents = contents;
	}
	
	public void show() {
		System.out.println("[" + getProgram() + "]" + " | " + getTitle());
		System.out.println(getCategory());
		System.out.println("감독:" + getDirector());
		System.out.println("출연진:" + getActor());

		
	}


	// 메서드
	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public String getProgram() {
		return program;
	}

	public String getDirector() {
		return director;
	}

	public String getActor() {
		return actor;
	}

	public boolean isNetflix() {
		return netflix;
	}

	public boolean istVing() {
		return tVing;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setPrograme(String program) {
		this.program = program;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setNetflix(boolean netflix) {
		this.netflix = netflix;
	}

	public void settVing(boolean tVing) {
		this.tVing = tVing;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	


}