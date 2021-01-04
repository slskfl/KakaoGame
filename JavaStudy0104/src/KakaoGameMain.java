import java.util.Scanner;

public class KakaoGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Character character=null;
		GameEngine gameEngine=null;
		
		System.out.println("원하는 캐릭터를 선택하시오.");
		System.out.println("1.라이언 2.어피치 3.무지");
		System.out.print(">>");
		int num = sc.nextInt();
	
		switch(num) {
			case 1:
				character = new Ryan();
				break;
			case 2:
				character = new Apeach();
				break;
			case 3:
				character = new Muzi();
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
		}
		
		if(character==null) {
			System.out.println("게임을 종료합니다.");
			return;
		} else {
			//캐릭터 생성
			gameEngine=new GameEngine(character);
		}
		
		//게임 종료 여부 확인
		while(true) {
			gameEngine.printMenu(sc);
			if(gameEngine.isExit()) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}
