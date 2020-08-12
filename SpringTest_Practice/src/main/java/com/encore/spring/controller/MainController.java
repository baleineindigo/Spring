package com.encore.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.encore.spring.domain.Phone;
import com.encore.spring.domain.UserInfo;
import com.encore.spring.model.IPhoneService;


@Controller
public class MainController {
	@Autowired
	private IPhoneService iPhoneService;
	
	@GetMapping("regPhone.do")
	public String getRegPhone(Model model) {
		model.addAttribute("title","핸드폰 등록폼");
		return "PhoneReg";
	}

	@PostMapping("savePhone.do")
	public String doRegPhone(Phone phone, Model model) {
		try {
			iPhoneService.insert(phone);
			model.addAttribute("title","휴대폰 등록 성공");
			return "Result";
		}catch(RuntimeException e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			return "Error";
		}
	}
	
	@GetMapping("searchPhone.do")
	public String doList(Model model) {
		try {
			List<Phone> list=iPhoneService.select();
			model.addAttribute("title", "핸드폰 관리 - 리스트");
			model.addAttribute("phones", list);
			return "PhoneList";
		}catch(RuntimeException e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			return "Error";
		}
		
	}
	
	@GetMapping("detail.do")
	public String doDetail(Phone phone,Model model ) {
		try {
			Phone vo=iPhoneService.select(phone);
			model.addAttribute("title","핸드폰 상세조회");
			model.addAttribute("Phone",vo);
			System.out.println("====================="+vo);
			return "PhoneView";
			}catch(RuntimeException e) {
				model.addAttribute("title", "핸드폰 관리 - 에러");
				return "Error";
		}
	}
	
	@GetMapping("login.do")
	public String getLoginForm() {
		return "Login";
	}
	
	@PostMapping("login.do")
	public String doLogin(UserInfo user, Model model, HttpSession session) {
		try {
			UserInfo loginUser=iPhoneService.select(user);
			
			if(loginUser!=null) {
				session.setAttribute("loginUser", loginUser);
				return "redirect:searchPhone.do";
			}else {
				return "Login";
			}
		}catch(RuntimeException e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			return "Error";
		}		
	}
	
	@GetMapping("delete.do")
	public String removePhone(Model model,HttpServletRequest request) {
		try {
		List<String> delList=new ArrayList<String>();
		for(String num :request.getParameterValues("num"))
			delList.add(num);
		iPhoneService.delete(delList);
		List<Phone> list=iPhoneService.select();
		model.addAttribute("title", "핸드폰 관리 - 리스트");
		model.addAttribute("phones", list);
		return "PhoneList";
		}catch(RuntimeException e) {
			model.addAttribute("title", "핸드폰 관리 - 에러");
			return "Error";
		}		
	}
}

