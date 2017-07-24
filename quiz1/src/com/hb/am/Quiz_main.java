package com.hb.am;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// 4지선다 퀴즈 목록에서 랜덤으로 10개를 뽑아 제시
// 문제 풀기

public class Quiz_main {
	
	
	public static void main(String[] args) {
		Quiz_DAO qd = new Quiz_DAO();
		ArrayList<Quiz_VO> qvo = qd.selectAll();
		int correct = 0;
		
		int[] quiz = new int[5];
		Set<Integer> quizSet = new HashSet<>();
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("퀴즈게임!");
		
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = (int)(Math.random()*qvo.size());
			if (!quizSet.add(quiz[i])) i--;
		}
		
		for (int k : quiz) {
			System.out.println(qvo.get(k).getQuiz());
			System.out.print("1. "+qvo.get(k).getQuiz_items()[0]+"\t");
			System.out.print("2. "+qvo.get(k).getQuiz_items()[1]+"\t");
			System.out.print("3. "+qvo.get(k).getQuiz_items()[2]+"\t");
			System.out.print("4. "+qvo.get(k).getQuiz_items()[3]+"\n");
			System.out.print("답 : ");
			String ans = scan.next();
			if (Integer.parseInt(ans)==qvo.get(k).getQuiz_answer()){
				System.out.println("정답입니다!");
				correct++;
			} else {
				System.out.println("오답입니다.");
			}
		}
		System.out.println("총 5문제 중 "+correct+"문제 맞추셨습니다.");
		System.out.println("수고하셨습니다.");

	}
}
