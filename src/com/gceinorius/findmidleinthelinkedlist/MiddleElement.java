package com.gceinorius.findmidleinthelinkedlist;

import java.util.LinkedList;
import java.util.List;

public class MiddleElement {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		int cn = (int)list.stream().count();
		if(cn % 2==0) {
			cn = cn + 1;
		}
	
		cn = cn / 2 ;
		
		System.out.println(list.get(cn));
	}

}
