package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv=new Television();
			myTv.channel=7;
			myTv.volume=10;
			myTv.onOff=true;
		
		Television testTv=new Television();
			testTv=myTv;  //값을 가져오는 것이 아니라 주소값을 복사한거라서 myTV를 가리키고 있는 상태임
			testTv.channel=536;
			
		Television yourTv=new Television();
			yourTv.channel=9;
			yourTv.volume=12;
			yourTv.onOff=true;
		
		System.out.println(myTv.channel+" "+myTv.volume+" "+myTv.onOff);
		System.out.println(yourTv.channel+" "+yourTv.volume+" "+yourTv.onOff);
		System.out.println(testTv.channel);
	}

}
