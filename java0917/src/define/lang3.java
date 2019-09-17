package define;

public class lang3 {
/*
      * interface 
       => 추상메소드와 final상수 만을 가진 개체 
       => 직접 객체 생성을 못하고 다른 클래스에 implements하거나 다른 인터페이스에 extends해서 사용
       => interface가 implements되어 있으면 그 클래스에는 interface의 메소드가 반드시 구현 되어 있어야 합니다. 
       => interface가 	implements되어 있으면 메소드가 구현되어 있다는 보장을 할 수 있습니다. 
             protocol(규칙,규약,약속)이라고도 합니다. 
       => interface는 식당의 메뉴판을 생각하면 됩니다. 
           다중 상속이라는 단어와는 상관없습니다. 
       
       clonable: Object clone()을 소유한 인터페이스 , clone은 내용을 복제해서 새로운 객체를 만들어주는 동작 
       comparable: int compareTo(T other)를 소유한 인터페이스, compareTo는 크기비교를 해주는 메소드 
			       호출하는 대상이 더크면 양수(1) 같으면 0 더 작으면 음수(-1)를 리턴합니다. 
			       모든 언어가 동일한 방법으로 결과를 리턴합니다. 
			       
       => 어떤 클래스가 인터페이스를 구현했는지는 도큐먼트의 가장 상단 부분의 All Implemented Interfaces	
            부분을 확인하면 됩니다.
                  
       => String클래스는 Serializable, CharSequence, comparable 인터페이스를 implements했습니다. 
       
       * Fast Enumerator(빠른열거)
        => 데이터의 모임을 순서대로 빠르게 접근하는 것 
        => 빠른 열거를 할 수 있는 대표적인 자료형이 배열, List, Set이 있습니다.
        for(임시변수 : 데이터의 모임) {
        
        }
        => 데이터의 모임에서 각각의 데이터를 임시변수에 대입해서 사용 할 수 있도록 해줍니다. 
        => 임시변수의 자료형은 반드시 데이터의 모임에서 1개에 해당하는 자료형이어야 합니다. 
        
       * Generics 
        => Object 클래스: 자바의 최상위 클래스, 자바의 모든 데이터는 Object클래스 타입의 변수에 대입할 수 있습니다.
        Object ? = 데이터; 
        상위 클래스 타입의참조형 변수에는 하위 클래스 타입의 객체 참조를 대입할 수 있다. 
        이 데이터를 사용할 때는 원래의 자료형으로 강제 형 변환을 해야 합니다. 
        
        => 일반화 프로그래밍(템플릿 프로그래밍)
        컴파일(소스코드를 기계 또는 운영체제가 인식할 수 있는 코드로 변환하는 작업)을 할 때  데이터의 자료형을 확인하지 않고
        실제 실행할 때 데이터의 자료형을 결정 할 수 있도록 하는 프로그래밍 방식  
        
        동일한 알고리즘을 사용하는 함수를 데이터의 자료형 때문에 여러 개를 만들지 않게 하기 위해서 만들어 낸 프로그래밍 방식 
        
        실제 자료형을 이용해서 프로그래밍 하지 않고 임시자료형(미지정 자료형)을 이용해서 클래스를 만들고 클래스를 가지고 
        객체를 만들 때 자료형을 결정하는 방식입니다. 
        
        미지정자료형에 실제 자료형을 대입할 때 기본형(데이터 1개만 저장하는 자료형 - boolean, byte, short, char, int, long, 
        float, double)은 안됩니다. 
        기본형을 대입하고자 할 때는 Wrapper Class(Boolean, Byte, Caracter, Integer, Float, Double)를 이용해야합니다. 
       
       1. 미지정 자료형 을 사용하는 클래스 
       class클래스이름<미지정 자료형이름을 나열> {
            미지정 자료형을 사용 
            
       } 
       숫자 2개의 덧셈을 수행해서 결과를 리턴하는 메소드를 만들기 
        public int add(int a, int b){
            return a+b;
        } 
			  
        public double add(double a, double b){
            return a+b;
        } 
        
        public T add( T a, T b){
            return a+b;
        }
        
        <int>add(10,20); 
       <double>add(20.4, 50.3); 
       
       int a = 10
        
       a = 10 
       
       2. 미지정 자료형을 사용하는 객체 생성 - 자료형을 지정해 주어야 합니다. 
       클래스이름 <실제 자료형 나열> 객체이름 = new 생성자<실제 자료형 나열>();
       =>jdk1.7부터는 새엇ㅇ자 뒤의 자료형을 생략할 수 있습니다. <>으로 가능 
       다른 곳에서 프로젝트를 import할 때 1.6버전으로 프로젝트를 가져오는 경우가 있으므로 확인해야 합니다.
       => 객체를 만들때 미지정 자료형을 결정하지 않으면 미지정 자료형은 Object타입이 됩니다.
       사용을 할 때 강제 형 변환을 하면서 사용해야 합니다. 
       
        3. 클래스를 볼때 <>가 있는지 확인해봐야 합니다. 
        <>가 있는 클래스를 사용할 때는 실제 자료형을 결정해서 사용해야 합니다. 
        자바에서 제너릭을 사용하는 클래스는 대부분 자료구조 클래스입니다. 
        
        Data Structure: 데이터를 어떻게 저장해서 사용할 것인가 하는 것 
        Algorithm: 어떤 문제를 어떤 방법으로 해결해 나갈 것인가 하는 것 
        
        4. 개발자가 직접 자료구조를 설계하거나 하지 않는 이상 직접 만드는 경우는 드뭅니다.
        우리가 만드는 이유는 아직 Generics가 적용된 클래스를 배우지 않아서 사용법을 익히기 위해서 입니다. 
        클래스만드는 것을 보지 말고 저런 클래스가 주어졌을 때 어떻게 객체를 만들어서 사용하는 지가 중요 
        
        5. 관습적으로 하나의 대문자를 미지정 자료형 이름으로 사용
	        E: 데이터를 의미 
	        K: key(이름)
	        V: value(이름에 해당하는 값)
	        K와 V는 쌍으로 사용 
        
       * Enum 
       => 상수의 모임 
       => 옵션을 선택하는 용도로 사용하기 위해서 생성 
       => 자바에서는 옵션을 알아보기 쉽게 하기 위해서 이전에는 static(클래스이름) final(읽기전용)을 주로 이용하였습니다.  
       성별을 저장하는 변수를 만들고 싶은 경우 
       boolean gender; gender=true; gender=false; 
       final boolean MAN = true; 
       final boolean WOMAN = false; 
       gender = MAN; 
       gender =WOMAN;
          
       int gender;  
       final int Man = 0; 
       final int WOMAN = 1; 
       gender = MAN; 
       gender = WOMAN; 
       gender = 19; 
       => java는 이런형태로 옵션을 만들었습니다. 
       static final field입니다. 
       
       최근에는 이 방법을 이용하지 않고 enum을 이용해서 선택을 제한합니다.
       enum 이름 { 
           열거형 상수 속성, 
           열거형 상수 속성..
       } 
       
       이름 변수명 = ?
       ?자리에서는 열거형 상수 속성만 대입이 가능합니다. 
       속성을 만들 때 값을 대입하는 것도 가능합니다. 
        
        enum Gender{
          MAN, WOMAN 
        }
        
        Gender s = Gender.MAN 또는 Gender.WOMAN 만 가능 
        GUI프로그래밍에서는 Radio Button과 같은 역활을 하도록 하기 위해서 enum을 사용합니다. 
        값을 대입하지 않으면 자동으로 0부터 시작하는 인덱스를 저장합니다. 
        ordinary()를 호출하면 인덱스를 리턴합니다.  
      
      * annotation 
      => @로 시작하는 문자열 
      => 주석을 만들거나 자바의 기능을 대신하는 용도로 사용 
      => 자바에서는 @Override, @Deprecated, @SupressWarning, @SafeVarargs, @FunctionalInterface를 제공 
      
      @Override는 오버라이딩 된 메소드라는 것을 명시하는 어노테이션 
         오버라이딩 된 메소드가 아니면 에러표시 
      
      @Deprecated 는 이메소드는 사용하는 것을 권장하지 않는다는 어노테이션 
         이 메소드는 앞으로 사용을 못하게 될 수 있다 라는 경고의 의미 
      
      @SupressWarning 은 이 메소드에서 발생하는 경고는 출력하지 말라는 어노테이션 
      
      @SafeVarargs은 Varargs에 Generic이 적용되었다는 표시 
      
      @FunctionalInterface는 이 인터페이스는 메소드가 1개 밖에 없어서 람다 형태로 사용할 수 있다라는 표시 
	     람다는 자바에서 함수형 프로그래밍을 지원하기 위해서 도입한 개념 (1.8부터 지원)
	     안드로이드는 이러한 인터페이스를 implements하게되면 람다 형태로 코드를 변경해 버립니다
	  => Spring에서는 많은 어노테이션을 제공하는 각 어노테이션이 자바의 기능을 대신하는 경우가 많습니다. 
	   
      
        
        
        
        
       
       
       
       

 */
}
