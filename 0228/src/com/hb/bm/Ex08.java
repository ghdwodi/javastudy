package com.hb.bm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map<k,v> : key�� value�� 1:1 ��Ī
// key�� ȣ���ϸ� value�� ���´�.
// key�� value�� not null�̴�.(TreeMap������ �����ϳ� ���� null�� �ִ� ���� ���� ����)
// key�� �ߺ��� ������� �ʴ´�.
// �߰��� add ��� �Ұ�. �ݵ�� put�� ����ؾ� �Ѵ�.
// ���� ȣ���� ���� get(index)�� ����Ѵ�. ���⿡�� index�� key�̴�.
// ���� key�� Set�� �����Ѵ�. �̸� keySet�̶� �θ���. keySet() �޼ҵ尡 ������ �����Ѵ�.
public class Ex08 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		// �߰�
		map.put(0, "��ī��");
		map.put(1, "������");
		map.put(2, "���̸�");
		map.put(3, "���α�");
		map.put(4, "������");
		map.put(5, "�ߵ���");
		map.put(6, "������");
		map.put(7, "�ǰ���");
		map.put(6, "��Ǫũ����");	// key�� �ߺ��Ǹ� ���� ������ �����ϰ� �߰�
		map.put(8, "�ǰ���");	// value�� �ߺ��� ������ �ʴ´�
		
		// �ϳ��� ȣ���ϱ�
		// Map���������� ������ for���� ����� �� ����.
		// key�� 0���� �����ϴ� ������ �־��� �� ���� �Ʒ�ó�� for���� ����� �� �ִ�.
		for (int i=0;i<map.size();i++){
			System.out.println(map.get(i));
		}
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("�̸�", "ȫ�浿");
		map2.put("����", "14");
		map2.put("�ּ�", "����");
		map2.put("����", "����");
		System.out.print(map2.get("�̸�")+"\t");
		System.out.print(map2.get("����")+"\t");
		System.out.print(map2.get("�ּ�")+"\t");
		System.out.print(map2.get("����")+"\n");
		
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
