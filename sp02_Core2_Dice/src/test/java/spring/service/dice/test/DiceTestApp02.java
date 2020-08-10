package spring.service.dice.test;

import spring.service.dice.impl.DiceAImpl;
import spring.service.dice.impl.DiceBImpl;
import spring.service.dice.impl.DiceCImpl;
import spring.service.dice.player.Player02;
import spring.service.dice.player.Player01;

// Spring 안 쓰고 인터페이스 만으로 재사용성을 높일 수 있다

public class DiceTestApp02 {
	///Main Method
	//곤솔창 반드시 확인!!!
	public static void main(String[] args){
		//생성자를 이용 사용할 Dice인 DiceImpl 객체를 생성자를 통해서 주입..
		Player02 player01 = new Player02(new DiceAImpl());
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
		System.out.println("=======================\n\n");
			
		//생성자를 이용 사용할 Dice인 DiceImpl 객체를 생성자를 통해서 주입..
		Player02 player02 = new Player02(new DiceBImpl());
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
		System.out.println("=======================\n\n");
	
		//생성자를 이용 사용할 Dice인 DiceImpl 객체를 생성자를 통해서 주입..
		Player02 player03 = new Player02(new DiceCImpl());
		player01.playDice(3);
		System.out.println("=======================");
		System.out.println("선택된 주사위 수의 통합은 : "+player01.getTotalValue());
		System.out.println("=======================\n\n");

		
		//setter 메소드를 이용해서 사용할 DiceImpl 객체를 주입함..
//		Player02 player1 = new Player02(new DiceAImpl());
//		player02.setDice(new DiceBImpl());
//		player02.playDice(3);
//		System.out.println("=======================");
//		System.out.println("선택된 주사위 수의 통합은 : "+player02.getTotalValue());
//		System.out.println("=======================\n\n");
	
		}
	}//end of class
	 
