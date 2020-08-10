package com.encore.spring.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.model.UploadDataVO;

@Controller
public class FileController {
		@RequestMapping("fileUpload.do")
	public ModelAndView fileUpload(HttpServletRequest request,UploadDataVO vo) throws IllegalStateException, IOException {
		//1. VO에서 MultipartFile을 받아온다...
		MultipartFile mFile=vo.getUploadFile();
		System.out.println("MultipartFile : "+mFile);
		
		/*2. 업로드된 파일이 있다면
		 *  - 파일의 사이즈/이름/파라미터명
		 *  +) 파일을 서버에 올리기
		 *  
		 *   업로드된 파일이 없다면
		 *   
		 */
		if((mFile.isEmpty())!=true) {//업로드 된 파일이 있다면
			System.out.println("파일 사이즈 : "+mFile.getSize());
			System.out.println("파일 이름  : "+mFile.getOriginalFilename());
			System.out.println("파일 파라미터 명 : "+mFile.getName());
			System.out.println("파일 컨텐츠 타입 : "+mFile.getContentType());
		}
		String root=request.getSession().getServletContext().getRealPath("/");
		String path=root+"\\upload\\";
		
		File copyFile=new File(path+mFile.getOriginalFilename());
		//원래 업로드 한 파일이 지정한 path로 이동할 때 복사본이 이동. 
		mFile.transferTo(copyFile);
		System.out.println("path : "+path);
		return new ModelAndView("upload_result","uploadfile",mFile.getOriginalFilename());
	}	

	// DownLoad	
	@RequestMapping("fileDown.do")
	public ModelAndView fileDownload(HttpServletRequest request,String filename) throws IOException{
		System.out.println("filename"+filename);
		String root=request.getSession().getServletContext().getRealPath("/");
		String path=root+"\\upload\\";
		
		HashMap map=new HashMap();
		//업로드한 파일을 특정 경로로 이동시키고 그걸 다운로드~!
		map.put("path",path);
		
		return new ModelAndView("downloadView",map);
	}
}
