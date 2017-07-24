package com.hb.bm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("미국", "워싱턴");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("필리핀", "마닐라");
		map.put("호주", "캔버라");
		
		Set<String> keys = map.keySet();
		
		exit :
		while(true){
			System.out.print("나라 입력 : ");
			String ans = scan.next();
			if (keys.contains(ans)){
				String cap = map.get(ans);
				System.out.println(ans+"의 수도는 "+cap+"입니다.");
			} else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			while(true){
				System.out.print("계속할까요?(y/n) : ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")){
					break;
				} else if (msg.equalsIgnoreCase("n")){
					break exit;
				} else {
					System.out.println("다시 입력해 주세요.(y/n)");
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
	}
}
