package sample0512;

public class Animal {
	protected double weight;
	protected String picture;

	// 생성자 이용해서 변수초기화
	public Animal() {   //생성자1
		this.weight = 999;
		this.picture = "Animal";
		System.out.println("Eagle Cont");
	}
	
	public Animal(double weight, String picture){  //생성자2
		super();
		this.weight=weight;
		this.picture=picture;
		System.out.println("Animal Cont2 ");
		
	}

	void eat() {
		System.out.println("eat()가 호출되었음");
	}

	void sleep() {
		System.out.println("sleep()가 호출되었음");
	}

}
