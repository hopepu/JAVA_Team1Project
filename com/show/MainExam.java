package com.show;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.show.DTO.DramaDTO;
import com.show.DTO.MemberDTO;
import com.show.DTO.ReviewDTO;
import com.show.DTO.ShowDTO;
import com.show.DTO.VarietyDTO;
import com.show.SV.FindSV;
import com.show.SV.LoginSV;
import com.show.SV.MenuSV;
import com.show.SV.MyPageSV;
import com.show.SV.SearchListSV;
import com.show.SV.SearchSV;

public class MainExam {
	//필드
	public static Scanner s = new Scanner(System.in);// 단어 입력
	public static Scanner sL = new Scanner(System.in);// 긴 문장 입력
	public static MemberDTO loginState ; //로그인 정보저장용 세션(변수)
	public static Connection conn = null;
	//셍성자
	public MainExam() {
		try {
			//1단계 : 드라이버명
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계 : url, id, pw
			conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.104:1521:xe", "member", "member1919");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버명 또는 ojdbc6.jar를 확인해 주세요.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("url, id, pw나 쿼리문이 잘못됨");
			e.printStackTrace();
			System.exit(0); //프로세스 강제종료
		}
	}

	
	public static void main(String[] args) {
		
		loginState = new MemberDTO(); //guest 용 객체로 loginState 생성
		MenuSV.mainMenu(s, sL, loginState);

	}// main close

}// class close
