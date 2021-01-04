
public abstract class Character {
	//추상클래스 >> 보통 공통부분을 만듦.
	protected int hp; // hit point
	protected int level=0;
	protected int energy;
	
	//구현부
	public abstract void eat(); // 밥 먹이기
	public abstract void sleep(); // 잠 재우기
	public abstract boolean play(); // 놀아주기
	public abstract boolean train(); // 운동하기
	public abstract void levelUp(); // 레벨업
	
	//에너지 체크하는 메서드>> 에너지가 0일 경우 게임 종료.
	public boolean checkEnergy() {
		if (energy<=0) {
			return true;
		} else {
			return false;
		}
	}
	
	//캐릭터의 정보를 출력하는 메서드
	public void printInfo() {
		System.out.println("캐릭터의 정보 출력");
		System.out.println("hp = " + hp);
		System.out.println("energy = " + energy);
		System.out.println("level = " + level); 
	}
	
}
