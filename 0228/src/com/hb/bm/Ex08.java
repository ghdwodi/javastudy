package com.hb.bm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map<k,v> : key와 value가 1:1 매칭
// key를 호출하면 value가 나온다.
// key와 value는 not null이다.(TreeMap에서는 가능하나 굳이 null을 넣는 경우는 거의 없다)
// key는 중복을 허용하지 않는다.
// 추가시 add 사용 불가. 반드시 put만 사용해야 한다.
// 값을 호출할 때도 get(index)를 사용한다. 여기에서 index는 key이다.
// 보통 key는 Set에 관리한다. 이를 keySet이라 부른다. keySet() 메소드가 별도로 존재한다.
public class Ex08 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		// 추가
		map.put(0, "피카츄");
		map.put(1, "라이츄");
		map.put(2, "파이리");
		map.put(3, "꼬부기");
		map.put(4, "버터플");
		map.put(5, "야도란");
		map.put(6, "피죤투");
		map.put(7, "또가스");
		map.put(6, "☆푸크린☆");	// key가 중복되면 이전 내용을 삭제하고 추가
		map.put(8, "또가스");	// value는 중복을 따지지 않는다
		
		// 하나씩 호출하기
		// Map구조에서는 개선된 for문을 사용할 수 없다.
		// key에 0부터 시작하는 정수를 주었을 때 한해 아래처럼 for문을 사용할 수 있다.
		for (int i=0;i<map.size();i++){
			System.out.println(map.get(i));
		}
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("이름", "홍길동");
		map2.put("나이", "14");
		map2.put("주소", "서울");
		map2.put("성별", "남자");
		System.out.print(map2.get("이름")+"\t");
		System.out.print(map2.get("나이")+"\t");
		System.out.print(map2.get("주소")+"\t");
		System.out.print(map2.get("성별")+"\n");
		
		for(String k :map2.keySet()){
			System.out.print(map2.get(k)+"\t");
		}
		System.out.println();
		Iterator<String> it = map2.keySet().iterator();
		while (it.hasNext()) {
			String m = (String) it.next();
			System.out.print(map2.get(m)+"\t");
		}
	}
}
