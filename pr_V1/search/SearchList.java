package pr_V1.search;

import java.util.ArrayList;

public class SearchList {
	// 검색기능 -> service menu

	// 구분없이 키워드로 검색(배우, 감독이름, 제목) -> 키워드에 해당되는 정보 출력
	// 카테고리 구분해서 검색 -> 카테고리에 + 검색 키워드에 맞는 정보 출력
	// 장르별 리스트 출력 -> 3개정도 출력
	

	private ArrayList<Drama> dramas;
	private ArrayList<Variety> varieties;
	
	public SearchList() {
		dramas = new ArrayList<Drama>();
		varieties = new ArrayList<Variety>();
		
		dramas.add(new Drama("Tving", "로맨스", "선재업고튀어", "윤종호, 이시은", "변우석, 김혜윤, 송건희, 이승협, 정영주, 성병숙 등",
				"만약, 당신의 최애를 구할 수 있는 기회가 된다면? \n삶의 의지를 놓아버린 순간, 자신을 살게 해줬던 유명아티스트 류선재 \n그의 죽음으로 절망했던 열성팬 임솔이 최애를 살리기 위해 시간을 거슬러 2008년으로 돌아간다!\n다시 살게 된 열아홉, 목표는 최애 류선재를 지키는 것!"));
		
		dramas.add(1, new Drama("Netflix", "로맨스", "이번 생도 잘 부탁해", "이나정, 최영림, 한아름", "신혜선, 안보현, 하윤경, 안동구",
				"반지음에겐 전생을 기억할 수 있는 신비한 능력이 있다. \n18회차 인생이 이른 나이에 끝난 후 다시 태어난 그녀.\n이번 생은 어느덧 어른이 된 어린 시절의 사랑을 찾는데 올인한다."));

		dramas.add(2, new Drama("Tving, Nexflix", "로맨스", "낮과 밤이 다른 그녀", "이형민, 박지하", "이정은, 정은지, 최진혁",
				"어느날 갑자기 노년타임에 갇혀버린 취준생과 낮과 밤 올 타임 \n그녀에게 휘말린 능력캐 검사의 기상천외한 인턴쉽과 앙큼달콤 로맨틱 코미디를 그리는 드라마"));

		dramas.add(3, new Drama("Tving, Netflix", "판타지", "미씽:그들이있었다", "민연홍, 반기리", "고수, 허준호, 안소희, 하준, 서은수, 송건희",
				"실종된 사망자들이 모인 영혼 마을을 배경으로, 사라진 시체를 찾고 \n사건배후의 진실을 쫓는 미스터리 추적 판타지"));

		dramas.add(4, new Drama("Tving, Netflix", "판타지", "경이로운 소문", "유선동, 김새봄", "조병규, 유준상, 김세정, 엄혜란 등",
				"악귀 사냥꾼 '카운터'들이 국수집 직원으로 위장해, 지상의 악귀들을 물리치는 \n통쾌하고 땀내나는 악귀타파 히어로물"));

		dramas.add(5, new Drama("Tving", "액션", "스틸러", "최준배, 신경일", "주원, 이주우, 조한철, 김재원, 최화정, 이덕화 등",
				"베일에 싸인 문화재 도둑 스컹크와 비공식 문화재 환수팀 '카르마'가 뭉쳐, \n법이 심판하지 못하는 자들을 상대로 펼치는 케이퍼 코믹액션"));
	}
	
	public void searchTitle(String title) { // 제목으로 검색
		for(Drama drama : dramas) {
			if(drama.getTitle().equalsIgnoreCase(title)) {
				drama.show();
			}
		}
	}
	
	public void searchCategory(String category) { // 카테고리별 검색
		for(Drama drama2 : dramas) {
			if(drama2.getCategory().equalsIgnoreCase(category)) {
				drama2.show();
			}
		}
	}

}
