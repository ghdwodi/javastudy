package com.hb.bm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10_map {
	private Set<String> keys;
	Map<String, String> map;
	
	public Set<String> getKeys() {
		return keys;
	}
	public void setKeys(Set<String> keys) {
		this.keys = keys;
	}
	Ex10_map(){
		map = new HashMap<>();
		map.put("�ѱ�", "����");
		map.put("���ѹα�", "����");
		map.put("�̱�", "������");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "�ĸ�");
		map.put("�ʸ���", "���Ҷ�");
		map.put("ȣ��", "ĵ����");
		
		keys = map.keySet();
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
