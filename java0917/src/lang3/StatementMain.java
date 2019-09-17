package lang3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StatementMain {

	public static void main(String[] args) {
		// Board 클래스의 객체 여러갤ㄹ 저장할 수 있는 자료구조를 생성 
		//배열(크기변경안됨), ArrayList(읽기는 빠름) , LinkedList(삽입삭제가 빠름)
		List<Statement> list = new LinkedList<>();
		// Board클래스의 객체를 만들어서 데이터를 설정한 후 list 에 삽입하기 
		//이부분은 데이터베이스에 읽어오던가 파일에서 읽어오는 형태로 변경 
		Statement st = new Statement(); 
		st.setWriteNo(10);
		st.setWriteTitle("오늘의 일기");
		st.setWriter("김기범"); 
		st.setWriteDate("19.09.17");
		
		list.add(st);
		
		st = new Statement();
		st.setWriteNo(22);
		st.setWriteTitle("하나의 사랑");
		st.setWriter("이은영"); 
		st.setWriteDate("19.09.18");
		
		list.add(st);
		
		st = new Statement();
		st.setWriteNo(33);
		st.setWriteTitle("마로니에 거리");
		st.setWriter("장학우"); 
		st.setWriteDate("19.09.19");
		
		list.add(st);
		
		
		list.sort(new Comparator<Statement>() {

			@Override
			public int compare(Statement o1, Statement o2) {
				
				return o1.getWriteDate().compareTo(o2.getWriteDate());
			}
			
		});
		
		System.out.printf(
				"%-10s%-20s%-15s%-10s\n", 
				"글번호",  "글제목", "글쓴이", "등록일");
		//Fast Enumeration을 이용한 List접근 
		for(Statement p : list) {
			System.out.printf(
					"%-10s%-20s%-15s%-10s\n", 
					p.getWriteNo(), p.getWriteTitle(), 
					p.getWriter(), p.getWriteDate());
		}
	}

}
