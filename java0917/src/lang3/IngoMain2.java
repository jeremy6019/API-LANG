package lang3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IngoMain2 {

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
			
	        //키보드로부터 입력받기 위한 객체를  생성 
			Scanner sc =new Scanner(System.in);
			System.out.printf("정렬기준을 선택하세요(1.이름 2.크기 3.종류):");
			int menu = sc.nextInt(); 
			switch(menu) {
			
			case 1: 
				Arrays.sort(arr, new Comparator<InfoName>() {

					@Override
					public int compare(InfoName o1, InfoName o2) {
						// o1	과 o2의 name을 비교 
						return o1.getName().compareTo(o2.getName());
					}
					
				});
				for(InfoName temp : arr) {
					System.out.printf("%s\n", temp);
				}
				break;
				
			case 2:
				Arrays.sort(arr, new Comparator<InfoName>() {

					@Override
					public int compare(InfoName o1, InfoName o2) {					
						return  o2.getSize() - o1.getSize() ;
					}
					
				});
				for(InfoName temp : arr) {
					System.out.printf("%s\n", temp);
				}
				break;
				
			case 3: 
				Arrays.sort(arr, new Comparator<InfoName>() {

					@Override
					public int compare(InfoName o1, InfoName o2) {
						// o1	과 o2의 name을 비교 
						return o1.getType().compareTo(o2.getType());
					}
					
				});
				for(InfoName temp : arr) {
					System.out.printf("%s\n", temp);
				}
				break;
			 
			default: 
				
				System.out.printf("메뉴는 1번과 2번, 3만 선택하세요.\n");
				break;
			}
				
			//입력받은 객체 닫기 
			sc.close();
			// 프로그램 종료 
			System.exit(0);
	}

}
