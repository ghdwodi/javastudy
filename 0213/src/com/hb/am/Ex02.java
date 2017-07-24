package com.hb.am;

public class Ex02 {
	public static void main(String[] args) {
		// StringBuffer() => 기본 길이와 용량을 지닌 String을 생성
		StringBuffer sb = new StringBuffer();
		System.out.println("길이 : "+sb.length());
		System.out.println("용량 : "+sb.capacity());
		System.out.println("내용 : "+sb);
				
		// append 메소드 => 내용 추가하기
		sb.append(true);
		System.out.println("길이 : "+sb.length());
		System.out.println("용량 : "+sb.capacity());
		System.out.println("내용 : "+sb);
		sb.append("korea");
		System.out.println("길이 : "+sb.length());
		System.out.println("용량 : "+sb.capacity());
		System.out.println("내용 : "+sb);
		sb.append(1234567);
		System.out.println("길이 : "+sb.length());
		System.out.println("용량 : "+sb.capacity());
		System.out.println("내용 : "+sb);
		sb.append('a');	// 용량을 초과하는 순간 자동으로 용량이 늘어난다.
		System.out.println("길이 : "+sb.length());
		System.out.println("용량 : "+sb.capacity());
		System.out.println("내용 : "+sb);
		
		// insert 메소드 => 내용 삽입하기
		// insert (int offset(삽입할 자리값), 삽입할 내용);
		sb.insert(4,"★");
		System.out.println(sb);
	}
}
