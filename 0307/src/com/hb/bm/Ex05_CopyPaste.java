package com.hb.bm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_CopyPaste {
	
	public int fileSize(String s){
		File file = new File(s);
		int size = (int)file.length();
		return size;
	}
	
	public byte[] copy(String s, int size){
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		byte[] b = new byte[size];
		try {
			fis = new FileInputStream(s);
			bis = new BufferedInputStream(fis);
			bis.read(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return b;
	}
	
	public void paste(String s, byte[] b){
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(s);
			bos = new BufferedOutputStream(fos);
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
