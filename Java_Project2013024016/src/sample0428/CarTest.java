package sample0428;

public class CarTest {

	static int numbers=0;
	
	public static int getNumbers(){
		return numbers;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("S600","white",80);   //생성자 호출
		Car c2 = new Car("E500","blue",20);    //생성자 호출
		int n = Car.numbers;    //정적 변수
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}
//main이 정적 메소드이기 때문에 main 안에는 public static int getNumbers와 같은거 만들지 않는다
}
/*static int menu1=7;
 * public static void main(String[] args){
  ++menu1;
  이렇게 해야됨!!menu1을 밖에서 그냥 int menu1으로 하면 필드에 작성한거라서!static 꼭 붙여 줘야지
  static method 안에 들어왔을 때 가능함*/

/*println은 정적 메소드임*/