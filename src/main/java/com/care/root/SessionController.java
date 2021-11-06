package com.care.root;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {
	@RequestMapping("make_session")
	public String makeSession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("id", "abc123");
		session.setAttribute("name", "Willy");
		
		return "session/makeSession";
	}
	@RequestMapping("result_session")
	public String resultSession(Model model) {
		model.addAttribute("id", "모델로 저장한 아이디"); //make_session과 똑같은 값 중복 -"id"
		return "session/resultSession";
	}
	@RequestMapping("del_session")
	public String delSession(HttpSession session) {
		session.removeAttribute("id"); //아이디만 삭제
		//session.invalidate(); //모든 세션을 만료
		return "session/delSession";
	}
}

