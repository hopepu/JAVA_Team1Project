package com.show.SV;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;
import com.show.DTO.MemberDTO;

public class LoginSV {

	public static void register(Scanner s, MemberDTO loginState, ArrayList<MemberDTO> loginDTOs) {
		MemberDTO join = new MemberDTO();

		System.out.println("회원 가입을 시작합니다.");
		boolean run = true;
		String joinID = "";
		while (run) {
			System.out.println("원하시는 ID를 입력하세요");
			System.out.print(">>>");
			joinID = s.next();
			boolean pass = true;
			pass = join.setId(joinID, loginDTOs, pass);

			if (pass) {
				join.setUsability(true);
				if (join.isUsability()) {
					System.out.println("사용 가능한 ID입니다.");
					System.out.println("--------------------");
					run = false;
				}
			}
		}
		System.out.println("원하시는 PW를 입력하세요");
		System.out.print(">>>");
		String joinPW = s.next();

		System.out.println("--------------------");
		System.out.println("이름을 입력하세요");
		System.out.print(">>>");
		String joinName = s.next();

		System.out.println("--------------------");
		System.out.println("생년월일을 입력하세요");
		System.out.print(">>>");
		String joinBirth = s.next();

		System.out.println("--------------------");
		System.out.println("닉네임을 입력하세요");
		System.out.print(">>>");
		String joinNickName = s.next();

		System.out.println("--------------------");
		System.out.println("e-mail을 입력하세요");
		System.out.print(">>>");
		String joinEmail = s.next();

		System.out.println("--------------------");
		System.out.println("전화번호를 입력하세요");
		System.out.print(">>>");
		String joinpNo = s.next();

		MemberDTO join1 = new MemberDTO(joinID, joinPW, joinName, joinBirth, joinNickName, joinpNo, joinEmail);
		loginDTOs.add(join1);

	}

	public static MemberDTO login(Scanner s, MemberDTO loginState, ArrayList<MemberDTO> loginDTOs) {
		System.out.print("ID : ");
		String id = s.next();
		System.out.print("PW : ");
		String pw = s.next();
		MemberDTO login = new MemberDTO(id, pw); // 입력받은 ID,PW를 넣을 객체 생성

		try {
			for (MemberDTO find : loginDTOs) {// memberDTOs 배열을 돌려
				int i = 0;
				if (find.getId().equals(id)) {
					if (find.getPw().equals(pw)) {
						System.out.println("로그인 성공!!");
						i = loginDTOs.indexOf(find);
						login = loginDTOs.get(i);
						login.setLoginStatus(true);
						loginState = login;
						break;
					} else {
//						System.out.println("id, pw를 확인해주세요.");
					} // if close
				} else {
//					System.out.println("id, pw를 확인해주세요.");
				} // if close

			} // for close
			if (login.getLoginStatus() == false) {
				System.out.println("id, pw를 확인해주세요.");
			}

		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요");
		} // try catch close

		return loginState;
	}// login method close

	/* 메서드-주민번호 추출 */
	public MemberDTO ssnChager(String fr_ssn, String bk_ssn, MemberDTO member) {// 주민번호 앞자리(fr_ssn)과 뒷자리(bk_ssn)을 받아 생년월일과 성별을 추출한다.
		// 주민번호 앞자리 YY-MM-DD 형태로 추출하기
		int calyear = Integer.parseInt(fr_ssn.substring(0, 2)); // 앞 2자리
		int calmonth = Integer.parseInt(fr_ssn.substring(2, 4)); // 중간 2자리
		int calday = Integer.parseInt(fr_ssn.substring(4)); // 끝 2자리

		int sexnum = Integer.parseInt(bk_ssn.substring(0, 1)); // 뒷번호 첫 글자 추출

		String year = (sexnum == 1 || sexnum == 2) ? "19" : "20"; // 주민번호 뒷자리 첫 글자가 1 또는 2면 앞에 19년을, 아니면 20년을 적용
		String birth = year + String.format("%02d", calyear) +"/"+ String.format("%02d", calmonth)+"/"
				+ String.format("%02d", calday); // YYYY/MM/DD 형태로 birth 저장
		String sex = (sexnum%2==0)? "여" : "남"; //주민번호 뒷자리 첫 글자가 짝수면 여, 홀수면 남
		member.setBirth(birth);
		member.setSex(sex);
		
		return member;
	}

}
