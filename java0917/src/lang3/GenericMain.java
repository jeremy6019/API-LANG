package lang3;

public class GenericMain {

	public static void main(String[] args) {
		
		// 미지정 자료형을 String으로 결정해서 객체 생성 
		Generic<String> 	ob1 = 
				    new Generic<String>("Java", "Kotlin", "Swift");
		 ob1.display();
		 
		// 미지정 자료형을 결정 할 때 기본형은 안됨 
		 // 1.7버전 이상에서는 생성자 뒤의 자료형은 생략 가능 
		Generic<Integer> ob2 =
				    new Generic<>(100, 200);
		ob2.display();
		
		
		
	}

}
