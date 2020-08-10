package spring.service.hello.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import spring.service.greet.Greet;

public class HelloTestApp03UseSpring {

	public static void main(String[] args) {
	// 1. BeanFactory 생성...주문서는 공장에서 미리 받아서 읽도록 함.
	// BeanFactory 생성할 때 주문서 함께 인자값으로 넣어준다...
	// Bean Configuration File(Bean 설정문서)
	// spring framework는 모듈의 라이브러리화한 것이라 DI프레임워크를 돌리기 위해서 Beans,Core,Context,Expression Language 등 라이브러리 설치 필요	
		System.out.println("1) Factory 생성");
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource
				("./src/main/resources/config/greet.xml")); // 주문서 입력하면 bean 생성하고 저장하는 팩토리 생성
		
	/* ClassPathSystem : src를 기본적으로 갖고 있음
	 * FilePathSystem : src부터 다 인식 시켜줘야 함 	
	 * Exception in thread "main" java.lang.NoClassDefFoundError: org/apache/commons/logging/LogFactory
	 * >> 라이브러리 클래스가 Nodef라는 뜻. LogFactory가 없음...apache라이브러리에서 가져오기(라이브러리 간의 의존성 작용)
	 */
		
	// 2. getBean()으로 bean을 받아와서 PrintMessage() 메서드 호출
		System.out.println("2) 클라이언트 호출");
//		Greet g1 =(Greet) factory.getBean("greet1");
//		g1.printMessage();

//		Greet g2 =(Greet) factory.getBean("greet2");
//		g2.printMessage();

//		Greet g3 =(Greet) factory.getBean("greet3");
//		g3.printMessage();
	
//		Greet g4 =(Greet) factory.getBean("greet4");
//		g4.printMessage();

		Greet g5 =(Greet) factory.getBean("greet5");
		g5.printMessage();

		
	}

}
