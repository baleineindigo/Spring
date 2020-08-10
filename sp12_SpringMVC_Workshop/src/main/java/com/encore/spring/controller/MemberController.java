package com.encore.spring.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.Member;
import com.encore.spring.model.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//find.jsp에서 회원 검색
	@RequestMapping("FMS.do")
	public ModelAndView MemberView(String id) {
		Member vo=memberService.getMember(id);	
		if(vo!=null) return new ModelAndView("find_ok","vo",vo);
		return new ModelAndView("find_fail");
	}

	@RequestMapping("AllMember.do")
	public ModelAndView AllMemberView() {
		List<Member> list=memberService.getMemberList();	
		if(list!=null) return new ModelAndView("allView","list",list);
		return new ModelAndView("find_fail");
	}

	@RequestMapping("IdcheckServlet.do")
	public ModelAndView RegisterView(HttpServletRequest request) {
		String id=request.getParameter("id");
		String message="";
		if (id.equals("")) 
			message="아이디를 입력해주세요";
		else if(memberService.getMember(id)!=null)
			message="해당 ID를 사용할 수 없음";
		else 
			message="해당 ID를 사용할 수 있음";
	//	System.out.println("map : "+map);
		return new ModelAndView("JsonView","message",message);
	}

	@RequestMapping("RGS.do")
	public ModelAndView RegisterView(HttpServletRequest request, Member member) {
		String checkId=request.getParameter("checkView");
		memberService.addMember(member);
		System.out.println("등록 성공!");
		return new ModelAndView("redirect:index.jsp");
	}

	
	@RequestMapping("LoginServlet.do")
	public ModelAndView LoginView(HttpServletRequest request) {
		String id= request.getParameter("id");
		String password= request.getParameter("password");
		Member member = new Member(id,password);
		Member vo=memberService.loginMember(member);
		request.getSession().setAttribute("vo", vo);
		return new ModelAndView("login_result","vo",vo);
	}
	
	@RequestMapping("LogoutServlet.do")
	public ModelAndView LogoutView(HttpSession session) {
		session.invalidate();
		return new ModelAndView("logout");
	}

	@RequestMapping("UpdateServlet.do")
	public ModelAndView UpdateView(HttpServletRequest request,Member member) {
		System.out.println(member);
		memberService.updateMember(member);
		Member vo=memberService.getMember(member.getId());
		request.getSession().setAttribute("vo", vo);
		return new ModelAndView("update_result","vo",vo);
	}

}
