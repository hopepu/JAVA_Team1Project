package com.show.SV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.show.DTO.Author;
import com.show.DTO.MemberDTO;
import com.show.exception.NoExistException;

public class LoginSV {
	
	

	/* 메소드-회원가입 */
	public static void register(Scanner s, ArrayList<MemberDTO> loginDTOs) {
		try {
			FIndSV.idFind(s, loginDTOs);
		} catch (NoExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//--register()
	
	
	/* 메소드-로그인 */
	public static void login() {
		
	}//--login()

}
