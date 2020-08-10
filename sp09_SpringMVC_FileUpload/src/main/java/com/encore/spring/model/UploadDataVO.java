package com.encore.spring.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadDataVO {
	private String userName;
	private MultipartFile uploadFile;
	//MultiparFile 변수 이름은 폼에서 fileUpload 하는 input 태그의  name으로 지정

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
}
