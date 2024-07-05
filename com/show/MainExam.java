package com.show;

import java.util.ArrayList;
import java.util.Scanner;

import com.show.DTO.LoginDTO;
import com.show.SV.SearchSV;

public class MainExam {

	public static LoginDTO lSt = new LoginDTO();
	public static Scanner s = new Scanner(System.in);// 단어 입력
	public static Scanner sL = new Scanner(System.in);// 긴 문장 입력
	public static ArrayList<LoginDTO> loginDTOs = new ArrayList<LoginDTO>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lSt.setLoginStatus(false);
		boolean run = true;
		System.out.println("<오잼>(가제 : 오늘은 무엇이 재밌을까?)에 오신것을 환영합니다.");

		while (run) {
			if (lSt.getLoginStatus()) {
				System.out.println("아래의 메뉴에서 골라주세요.");
				System.out.println("1. 찾아보기  |  2. 로그인");
				System.out.print(">>>");
				int select = s.nextInt();
				if (select == 1) {
				}

			} else {
				System.out.println("아래의 메뉴에서 골라주세요.");
				System.out.println("1. 찾아보기  |  2. 로그인");
			} // if close
		} // while close

	}// main close

}// class close
