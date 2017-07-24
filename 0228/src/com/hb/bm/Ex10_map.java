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
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("미국", "워싱턴");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("필리핀", "마닐라");
		map.put("호주", "캔버라");
		
		keys = map.keySet();
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
