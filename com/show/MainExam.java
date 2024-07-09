package com.show;

import java.util.ArrayList;
import java.util.Scanner;

import com.show.DTO.DramaDTO;
import com.show.DTO.MemberDTO;
import com.show.DTO.ReviewDTO;
import com.show.DTO.ShowDTO;
import com.show.DTO.VarietyDTO;
import com.show.SV.LoginSV;
import com.show.SV.MyPageSV;
import com.show.SV.SearchListSV;
import com.show.SV.SearchSV;

public class MainExam {

	public static MemberDTO lSt = new MemberDTO();
	public static Scanner s = new Scanner(System.in);// 단어 입력
	public static Scanner sL = new Scanner(System.in);// 긴 문장 입력
	public static ArrayList<MemberDTO> loginDTOs = new ArrayList<MemberDTO>();
	public static ArrayList<ReviewDTO> reviewDTOs = new ArrayList<ReviewDTO>();
	public static ArrayList<ShowDTO> showDTOs = new ArrayList<ShowDTO>();
	public static ArrayList<DramaDTO> dramaDTOs = new ArrayList<DramaDTO>();
	public static ArrayList<VarietyDTO> varietyDTOs = new ArrayList<VarietyDTO>();

	public static void main(String[] args) {
		
		lSt.setLoginStatus(false);
		boolean run = true;
		System.out.println("<오잼>(가제 : 오늘은 무엇이 재밌을까?)에 오신것을 환영합니다.");

		while (run) {
				if (!lSt.getLoginStatus()) {
					System.out.println("아래의 메뉴에서 골라주세요.");
					System.out.println("1. 찾아보기  |  2. 로그인");
					System.out.print(">>>");
					int select = s.nextInt();
					switch (select) {
					case 1:
						System.out.println("찾아보기 메뉴로 들어갑니다.");
						SearchSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs, dramaDTOs, varietyDTOs);
						break;
					case 2:
						System.out.println("로그인 메뉴로 들어갑니다.");
						lSt = LoginSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs,  dramaDTOs, varietyDTOs);
						break;
					default:
						System.out.println("1~2를 골라주세요");
					} // switch close
				} else {
					System.out.println("아래의 메뉴에서 골라주세요.");
					System.out.println("1. 찾아보기  |  2. 회원정보관리");
					System.out.print(">>>");
					int select = s.nextInt();
					switch (select) {
					case 1:
						System.out.println("찾아보기 메뉴로 들어갑니다.");
						SearchSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs, dramaDTOs, varietyDTOs);
						break;
					case 2:
						System.out.println("회원정보관리 메뉴로 들어갑니다.");
						lSt = MyPageSV.menu(s, loginDTOs, lSt);
						break;
					default:
						System.out.println("1~2를 골라주세요");
					}
				}// if close
		} // while close

	}// main close

}// class close
