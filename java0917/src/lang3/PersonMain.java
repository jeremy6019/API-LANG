package lang3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		
		//테이블 구조 만들기 
		List<Person> list = new ArrayList<>();
		List<Person> list1 = new LinkedList<>();
		
		//테이블에 삽입할 데이터를 생성 
		Person person = new Person();
		person.setName("김기범"); 
		person.setPhone("01050386578");
		person.setAddress("서울시 강동구 길동");
		person.setAge(45);
		
		//테이블에 데이터를 삽입하기 
		list.add(person); 
		
		person = new Person();
		person.setName("이은영"); 
		person.setPhone("01093657051");
		person.setAddress("서울시 강동구 고덕동");
		person.setAge(39);
		
		//테이블에 데이터를 삽입하기 
		list.add(person); 
        
		//데이터 정렬(sort) 
		list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getAge() - o2.getAge();
				
			}
			
		});
		
		//타이틀을 출력 
		System.out.printf(
				"%-10s%-24s%-32s%-3s\n", 
				"이름",  "전화번호", "주소", "나이");
		//Fast Enumeration을 이용한 List접근 
		for(Person p : list) {
			System.out.printf(
					"%-10s%-15s%-20s%-3d\n", 
					p.getName(), p.getPhone(), 
					p.getAddress(), p.getAge());
		}
	
		
		
	}

}
