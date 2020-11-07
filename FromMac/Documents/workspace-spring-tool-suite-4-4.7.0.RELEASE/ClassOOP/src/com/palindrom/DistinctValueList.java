package com.palindrom;

import java.util.ArrayList;

public class DistinctValueList {
	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(5);
		list.add(5);
		list.add(7);
		var myArr = new int[list.size()];
		boolean flag;
		for (int i = 0; i < list.size(); i++) {
			flag = true;
			for (int j = 0; j < i; j++) {
				if (myArr[j] == list.get(i))
					flag = false;
			}
			if (flag == true) {
				myArr[i] = list.get(i);
			}
		}
		list.clear();
		for (int j = 0; j < myArr.length; j++)
			if (myArr[j] != 0)
				list.add(myArr[j]);

		for (var z : list) {
			System.out.println(z);
		}
	}
}
