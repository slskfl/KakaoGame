
public class Muzi extends Character{

	public Muzi() {
		// TODO Auto-generated constructor stub
		hp=20;
		energy=30;
		System.out.println("무지가 생성되었습니다.");
		printInfo();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		energy+=5;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		energy+=20;
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		energy-=10;
		hp+=15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		// TODO Auto-generated method stub
		energy-=10;
		hp+=20;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		if(35<=hp) {
			level++;
			hp-=35;
		}
	}

}
