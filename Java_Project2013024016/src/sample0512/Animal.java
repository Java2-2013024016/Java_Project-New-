package sample0512;

public class Animal {
	protected double weight;
	protected String picture;

	// ������ �̿��ؼ� �����ʱ�ȭ
	public Animal() {   //������1
		this.weight = 999;
		this.picture = "Animal";
		System.out.println("Eagle Cont");
	}
	
	public Animal(double weight, String picture){  //������2
		super();
		this.weight=weight;
		this.picture=picture;
		System.out.println("Animal Cont2 ");
		
	}

	void eat() {
		System.out.println("eat()�� ȣ��Ǿ���");
	}

	void sleep() {
		System.out.println("sleep()�� ȣ��Ǿ���");
	}

}
