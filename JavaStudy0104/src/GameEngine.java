import java.util.Scanner;

public class GameEngine {

	private Character character; 	//ĳ����
	private int menu;				//�޴�
	private boolean exit;			//����
	
	public GameEngine(Character character) {
		this.character=character;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("1.�� ���̱� 2.�� ���� 3.����ֱ� 4.��ϱ� 5. ����");
		System.out.print(">>");
		menu=sc.nextInt();
		play();
	}

	public void play() {
		// TODO Auto-generated method stub
		switch(menu) {
			case 1:
				character.eat();
				break;
			case 2:
				character.sleep();
				break;
			case 3:
				exit=character.play();
				break;
			case 4:
				exit=character.train();
				break;
			case 5:
				exit=true;
		}
		character.printInfo();
	}
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

}
