package sample_0324;

public class apartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9;i>=1;i--){
			for(int j=1;j<9;j++){
				if((i>=6) && (j>=6)){      //4<x<10이렇게 쓰면 자바가 인정 노노(4<x)&&(x<10)
					break;					
				}
				System.out.print((i*100+j) + " " );
		}
			System.out.println(" ");
		}

	}
	}
