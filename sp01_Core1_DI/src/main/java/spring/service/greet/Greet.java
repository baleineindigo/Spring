package spring.service.greet;

/*
 * FileName : Hello.java
 * ㅇ package / private Field(property) / Constructor / getter,setter / 필요한 Method 
 * ㅇ 위와 같은 것들을 갖는 빈 규약을 준한 일반적인 Bean ::  POJO(Plain Old Java Object)
 * 	- 인터페이스의 제약을 받지 않는 오브젝트
 */
public class Greet{
	
	///Field
	private String message;
	
	///Constructor Method
	public Greet() {
		System.out.println("3) 클라이언트 호출 후, 이때 생성... Constructor Method \n BeanFactory는 Lazy Loading");
		System.out.println(getClass().getName()+"Hello~!!!!");
	}
	public Greet(String message) {
		this.message = message;
	}

	///Method
	//==> getter / setter Method definition
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	//==> message 를 출력하는 Method  
	public void printMessage() {
		System.out.println("\n"+getClass().getName()+"=>"+message);
	}
	
}//end of class