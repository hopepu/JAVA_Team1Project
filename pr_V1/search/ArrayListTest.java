package pr_V1.search;

public class ArrayListTest {

	public static void main(String[] args) {

		SearchList search = new SearchList();
		
		System.out.println("--------------------------");
		System.out.println("1.로맨스");
		search.searchCategory("로맨스");
		System.out.println("--------------------------");
		System.out.println("2.액션");
		search.searchCategory("액션");
		System.out.println("--------------------------");
		System.out.println("3.코미디");
		search.searchCategory("코미디");
		System.out.println("--------------------------");
		System.out.println("4.SF");
		search.searchCategory("SF");
		System.out.println("--------------------------");
		System.out.println("5.판타지");
		search.searchCategory("판타지");
		System.out.println("--------------------------");
		System.out.println("6.미스터리");
		search.searchCategory("미스터리");

	}// main

}// class
