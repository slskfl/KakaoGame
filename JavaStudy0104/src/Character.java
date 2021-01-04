
public abstract class Character {
	//�߻�Ŭ���� >> ���� ����κ��� ����.
	protected int hp; // hit point
	protected int level=0;
	protected int energy;
	
	//������
	public abstract void eat(); // �� ���̱�
	public abstract void sleep(); // �� ����
	public abstract boolean play(); // ����ֱ�
	public abstract boolean train(); // ��ϱ�
	public abstract void levelUp(); // ������
	
	//������ üũ�ϴ� �޼���>> �������� 0�� ��� ���� ����.
	public boolean checkEnergy() {
		if (energy<=0) {
			return true;
		} else {
			return false;
		}
	}
	
	//ĳ������ ������ ����ϴ� �޼���
	public void printInfo() {
		System.out.println("ĳ������ ���� ���");
		System.out.println("hp = " + hp);
		System.out.println("energy = " + energy);
		System.out.println("level = " + level); 
	}
	
}
