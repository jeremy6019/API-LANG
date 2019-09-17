package lang3;

import java.util.Arrays;

public class InfoMain {

	public static void main(String[] args) {
		// InfoName의 배열을 생성 
		InfoName g1 = new InfoName(); 
		g1.setName("브릿지스톤");
		g1.setSize(120);
		g1.setType("드라이버"); 
		
		InfoName g2 = new InfoName(); 
		g2.setName("미즈노");
		g2.setSize(90);
		g2.setType("아이언");
		
		InfoName g3 = new InfoName(); 
		g3.setName("보키");
		g3.setSize(60);
		g3.setType("웨지"); 
     
		//위에서 만든 InfoName 객체 3개를 가지고 배열을 생성  
		InfoName [] arr = { g1, g2, g3};
		//배열의 데이터를 확인 
		for(InfoName temp : arr) { 
			//객체이름을 %s에 매핑시켜서 출력하면 toString()의 결과가 출력 
			System.out.printf("%s\n", temp);
		}
				
		//배열의 데이터 정렬 
		//데이터를 정렬하려면 크기 비교하는 메소드가 구현되어 있어야 합니다. 
		//Comparable인터페이스의  compareTo 메소드 입니다. 
		//아니면 Comparator인터페이스를 구현한 객체를 대입해 주어야 합니다. 
		Arrays.sort(arr);
		System.out.printf("========================\n");
				
		//배열의 데이터를 확인 
		for(InfoName temp : arr) { 
			//객체이름을 %s에 매핑시켜서 출력하면 toString()의 결과가 출력 
			System.out.printf("%s\n", temp);
		}
		
	}

}
