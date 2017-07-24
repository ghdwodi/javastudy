package com.hb.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test {
	public static void main(String[] args) {
		String url = "http://data.mafra.go.kr:7080/openapi/59b8562426e598d34bad37835a94736c23205ab31f14808b6003978930bb873a/xml/Grid_20151204000000000316_1/1/5";
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document document = docBuilder.parse(url);
			Element rootElement = document.getDocumentElement();
			
			NodeList nodeList = rootElement.getElementsByTagName("totalCnt");
			System.out.println(nodeList.item(0).getTextContent());
			int lastIndex = Integer.parseInt(nodeList.item(0).getTextContent());
			int firstIndex = lastIndex-99;
			String newUrl = "http://data.mafra.go.kr:7080/openapi/59b8562426e598d34bad37835a94736c23205ab31f14808b6003978930bb873a/xml/Grid_20151204000000000316_1/"+firstIndex+"/"+lastIndex;
			document = docBuilder.parse(newUrl);
			rootElement = document.getDocumentElement();
			nodeList = rootElement.getElementsByTagName("row");
			NodeList childNodes = nodeList.item(0).getChildNodes();
			for(int i=0;i<childNodes.getLength();i++){
				Node info = childNodes.item(i);
				if(info.getNodeType()==Node.ELEMENT_NODE){
					if(info.getNodeName().equals("OCCRRNC_DE")){
						Element el = (Element)info;
						System.out.println(el.getTextContent());
						Calendar cal = Calendar.getInstance();
						cal.add(Calendar.MONTH,-1);
						SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
						Date d = df.parse(el.getTextContent());
						System.out.println(d.compareTo(cal.getTime()));
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
}
