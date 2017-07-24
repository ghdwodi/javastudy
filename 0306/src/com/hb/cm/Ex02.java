package com.hb.cm;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String path = "C:/util/test01.txt";
		File file = new File(path);
		try {
			boolean res = file.createNewFile();
			if (res) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");	// 파일명이 같은 파일이 이미 존재하면 실패
			}
			System.out.println("::::::::::::::::::::::::::::::");
			System.out.println("절대경로 : "+file.getAbsolutePath());
			System.out.println("상대경로 : "+file.getPath());
			System.out.println("정규화경로 : "+file.getCanonicalPath());
			System.out.println("파일이름 : "+file.getName());
			System.out.println("상위디렉토리 : "+file.getParent());
			
			boolean res2 = file.delete();
			if (res2){
				System.out.println("파일 삭제 성공");
			} else {
				System.out.println("파일 삭제 실패");
			}
			
			File file2 = new File("c:/util/exam");
			file2.mkdirs();
			file2.delete();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);	// 파일 경로가 다르면 예외로 처리
		}
	}
}
