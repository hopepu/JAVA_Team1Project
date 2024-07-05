package com.show;

import java.util.ArrayList;
import java.util.Scanner;

import com.show.DTO.LoginDTO;
import com.show.DTO.ReviewDTO;
import com.show.DTO.ShowDTO;
import com.show.SV.LoginSV;
import com.show.SV.MyPageSV;
import com.show.SV.SearchSV;

public class MainExam {

	public static LoginDTO lSt = new LoginDTO();
	public static Scanner s = new Scanner(System.in);// 단어 입력
	public static Scanner sL = new Scanner(System.in);// 긴 문장 입력
	public static ArrayList<LoginDTO> loginDTOs = new ArrayList<LoginDTO>();
	public static ArrayList<ReviewDTO> reviewDTOs = new ArrayList<ReviewDTO>();
	public static ArrayList<ShowDTO> showDTOs = new ArrayList<ShowDTO>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lSt.setLoginStatus(false);
		boolean run = true;
		System.out.println("<오잼>(가제 : 오늘은 무엇이 재밌을까?)에 오신것을 환영합니다.");
		System.out.println(lSt.getLoginStatus());

		while (run) {			
				if (lSt.getLoginStatus()) {
					System.out.println("아래의 메뉴에서 골라주세요.");
					System.out.println("1. 찾아보기  |  2. 로그인");
					System.out.print(">>>");
					int select = s.nextInt();
					switch (select) {
					case 1:
						System.out.println("찾아보기 메뉴로 들어갑니다.");
						SearchSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs);
						break;
					case 2:
						System.out.println("로그인 메뉴로 들어갑니다.");
						lSt = LoginSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs);
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
						SearchSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs);
						break;
					case 2:
						System.out.println("회원정보관리 메뉴로 들어갑니다.");
						lSt = MyPageSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs);
						break;
					default:
						System.out.println("1~2를 골라주세요");
					}
				}// if close
		} // while close

	}// main close

}// class close
