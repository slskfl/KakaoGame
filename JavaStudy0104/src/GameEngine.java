import java.util.Scanner;

public class GameEngine {

	private Character character; 	//캐릭터
	private int menu;				//메뉴
	private boolean exit;			//종료
	
	public GameEngine(Character character) {
		this.character=character;
	}
	
	public void printMenu(Scanner sc) {
		System.out.println("1.밥 먹이기 2.잠 재우기 3.놀아주기 4.운동하기 5. 종료");
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
