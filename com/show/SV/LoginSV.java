package com.show.SV;

import java.util.ArrayList;
import java.util.Scanner;

import com.show.DTO.DramaDTO;
import com.show.DTO.MemberDTO;
import com.show.DTO.ReviewDTO;
import com.show.DTO.ShowDTO;
import com.show.DTO.VarietyDTO;

public class LoginSV {

	public static MemberDTO menu(MemberDTO lSt, Scanner s, Scanner sL, ArrayList<MemberDTO> loginDTOs,
			ArrayList<ReviewDTO> reviewDTOs, ArrayList<ShowDTO> showDTOs, ArrayList<DramaDTO> dramaDTOs,
			ArrayList<VarietyDTO> varietyDTOs) {
		boolean run = true;

		while (run) {
			if (!lSt.getLoginStatus()) {
				System.out.println("1. 로그인 | 2. 회원가입 | 3. exit | 4. 영화 정보 찾기");
				System.out.print(">>>");
				String select = s.next();
				switch (select) {

				case "1":
					System.out.println("로그인을 위한 ID / PW를 입력하세요.");
					System.out.print("ID : ");
					String id = s.next();
					System.out.print("PW : ");
					String pw = s.next();
					MemberDTO login = new MemberDTO(id, pw);

					for (MemberDTO find : loginDTOs) {

						if (find.getId().equals(id)) {
							System.out.println("ID를 확인했습니다.");

							if (find.getPw().equals(pw)) {
								System.out.println("PW를 확인했습니다.");
								System.out.println("로그인 성공!!");
								lSt = find;
								lSt.setLoginStatus(true);
								// 로그인 성공시에 로그인 스테이터스 논리값 부여필요
							} else {
								System.out.println("ID와 PW를 확인 해주세요");
							} // if-if문 종료
						} else {
							System.out.println("ID와 PW를 확인 해주세요");
						} // if문 종료
					} // for문 종료
					break;
				case "2":
					MemberDTO join = new MemberDTO();

					System.out.println("회원 가입을 시작합니다.");
					System.out.println("원하시는 ID를 입력하세요");
					System.out.print(">>>");
					String joinID = s.next();
					join.setId(joinID, loginDTOs);

					System.out.println("원하시는 PW를 입력하세요");
					System.out.print(">>>");
					String joinPW = s.next();

					System.out.println("생년월일을 입력하세요");
					System.out.print(">>>");
					String joinBirth = s.next();

					System.out.println("닉네임을 입력하세요");
					System.out.print(">>>");
					String joinNickName = s.next();

					join.setPw(joinPW);
					join.setBirth(joinBirth);
					join.setNickName(joinNickName);
					loginDTOs.add(join);
					break;
				case "3":
					System.out.println("메인메뉴로 돌아갑니다.");
					break;
				case "4":
					System.out.println("영화정보 찾기 메뉴로 돌아갑니다.");
					SearchSV.menu(lSt, s, sL, loginDTOs, reviewDTOs, showDTOs, dramaDTOs, varietyDTOs);
					break;
				default:
					System.out.println("1~3사이에서 입력해주시기 바랍니다.");

				} // switch 종료
			} else {
				System.out.println("1. 마이페이지 | 2. 로그아웃 | 3. exit | 4. 영화정보찾기");
				System.out.print(">>>");
				String select = s.next();
				switch (select) {

				case "1":
					MyPageSV.menu(sL, loginDTOs, lSt);
					break;
				case "2":
					MemberDTO join = new MemberDTO();

					System.out.println("회원 가입을 시작합니다.");
					System.out.println("원하시는 ID를 입력하세요");
					System.out.print(">>>");
					String joinID = s.next();
					join.setId(joinID, loginDTOs);

					System.out.println("원하시는 PW를 입력하세요");
					System.out.print(">>>");
					String joinPW = s.next();

					System.out.println("생년월일을 입력하세요");
					System.out.print(">>>");
					String joinBirth = s.next();

					System.out.println("닉네임을 입력하세요");
					System.out.print(">>>");
					String joinNickName = s.next();

					join.setPw(joinPW);
					join.setBirth(joinBirth);
					join.setNickName(joinNickName);
					loginDTOs.add(join);
					break;
				case "3":
					System.out.println("메인메뉴로 돌아갑니다.");
					break;
				case "4":
					System.out.println("회원정보 찾기 메뉴로 돌아갑니다.");
					FIndSV.menu(sL, loginDTOs);
					break;
				default:
					System.out.println("1~3사이에서 입력해주시기 바랍니다.");
				}
			}

		}
		return lSt;
	}

}
