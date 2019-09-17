package lang3;

import java.util.Arrays;

public class ArraysMain1 {

	public static void main(String[] args) {
	    
		String[] names = {"류현진", "커쇼", "뷸러", "마에다", "디그롬"};
		// 배열의 데이터를 정렬해주는 메소드 
		// Arrays.sort - String 클래스는 Comparable을 implements
		// 했으므로 정렬 가능 
	    Arrays.sort(names);
	    //정렬이 되었는지 확인 
	    for(String name : names) {
	    	System.out.printf("%s\n", name);
	    }
	    
	    //정수배열도 정렬이 가능 
	    //정수는 int이지만 Arrays가 볼때는 Integer입니다. 
	    // 정수 배열 
	    int[] ar = {45,76,23,58,11,27,33} ;
	    //정렬하지 않은 상태에서 binarySearch 수행  
	    // binarySearch는 정렬이 안된 상태에서 하면 올바른 결과를 가져오지 못합니다. 
	    int result = Arrays.binarySearch(ar, 58);   
	    System.out.printf("result:%d\n", result);
	    //먼저 정렬을 수행하고 binarySearch 수행 
	    // 11, 23, 27, 33, 45, 58, 76 
	    Arrays.sort(ar);
        result = Arrays.binarySearch(ar, 76)	; 
        System.out.printf("result:%d\n", result);
	    
	}

}
