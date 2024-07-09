package com.show.SV;

import java.util.ArrayList;
import java.util.Scanner;
import com.show.DTO.DramaDTO;
import com.show.DTO.MemberDTO;
import com.show.DTO.ReviewDTO;
import com.show.DTO.ShowDTO;
import com.show.DTO.VarietyDTO;

public class ReviewSV {
	public static ArrayList<ReviewDTO> reviewDTOs = new ArrayList<ReviewDTO>();

	public static void review( Scanner s, Scanner sL, ArrayList<MemberDTO> loginDTOs, ArrayList<ShowDTO> showDTOs, ArrayList<DramaDTO> dramaDTOs, ArrayList<VarietyDTO> varietyDTOs) {
		
		reviewDTOs = new ArrayList<ReviewDTO>();
		
		System.out.println("================ 리뷰 게시판 입니다. ================");
		System.out.println("1. 리뷰 작성하기 ");
		System.out.println("2. 리뷰 수정하기 ");
		System.out.println("3. 리뷰 게시글 확인하기 ");
		System.out.println("4. 리뷰 게시글 삭제 ");
		System.out.println("5. 메인 메뉴 돌아가기 ");
		int select = s.nextInt();
		
		switch (select) {
		
		case 1 :
			System.out.println("리뷰 작성하기 메서드 진입합니다.");
			write(s, sL, reviewDTOs);
			break;
			
		case 2 :
			System.out.println("리뷰 수정하기 메서드 진입합니다.");
			modify(s, sL, reviewDTOs);
			break;	
			
		case 3 :
			System.out.println("리뷰 게시글 확인하기 메서드 진입합니다.");
//			write();
			break;	
			
		case 4 :
			System.out.println("리뷰 게시글 삭제 메서드 진입합니다.");
//			write();
			break;	
			
		case 5 :
			System.out.println("메인메뉴로 돌아갑니다.");
//			write();
			break;	
			
		default :
			System.out.println("해당되는 번호가 없습니다. 다시 입력해 주시길 바랍니다.");
			
		}//스위치 종료
		
	}

	private static void modify(Scanner s, Scanner sL, ArrayList<ReviewDTO> reviewDTOs2) {
		// 리뷰 게시판 - 수정하기 메서드
		
		reviewDTOs = modReview = new ReviewDTO();	//리뷰 수정용 빈 객체 생성.
				
				System.out.println("무엇을 수정 하시겠습니까 ? ");
				System.out.println("1.제목 | 2.내용 | 3.작성자 | 4.별점 | 5.취소");
				int modInt = s.nextInt();
				
				switch (modInt) {
				
				case 1 :
					System.out.println("수정할 제목을 입력해 주세요.");
					System.out.print(">>>");
					String title = s.next();
					
				}
		
				
	}// 수정하기 메서드 close		
		
		
		
	

	private static void write(Scanner s, Scanner sL, ArrayList<ReviewDTO> reviewDTOs2) {
		// 리뷰 게시판 - 작성하기 메서드
		
		/*
		 * settitle = otttitle 
		 * set starpoint = 1~5 
		 * comment = sl.nextline() 
		 * setnickname = loginstatenickname
		 */
		
		System.out.println(" 리뷰를 작성 합니다. ");
		
		ReviewDTO newReview = new ReviewDTO(); 
		for (ReviewDTO newBoard : reviewDTOs) {
			
		}
		
		
		System.out.println();
		
		System.out.println(" 작성할 제목을 입력해 주세요");
		System.out.print(">>>");
		String title = s.next();
		
		System.out.println(" 내용을 입력해 주세요 ");
		String comment = sL.nextLine();
		
		System.out.println(" 작성자를 입력해 주세요. ");
		System.out.print(">>>");
		String nickName = s.next();
		
		System.out.print("별점을 입력해 주세요. ");
		String starPoint = s.next();
		
		
		
		
	}// 작성하기 메서드 close
	
	
	
}
