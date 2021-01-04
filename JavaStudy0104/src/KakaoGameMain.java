import java.util.Scanner;

public class KakaoGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Character character=null;
		GameEngine gameEngine=null;
		
		System.out.println("���ϴ� ĳ���͸� �����Ͻÿ�.");
		System.out.println("1.���̾� 2.����ġ 3.����");
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
				System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		
		if(character==null) {
			System.out.println("������ �����մϴ�.");
			return;
		} else {
			//ĳ���� ����
			gameEngine=new GameEngine(character);
		}
		
		//���� ���� ���� Ȯ��
		while(true) {
			gameEngine.printMenu(sc);
			if(gameEngine.isExit()) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}
}
