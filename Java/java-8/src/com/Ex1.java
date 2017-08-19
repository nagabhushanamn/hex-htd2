package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Nag");
		list.add("Kannan");
		list.add("Ria");

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		System.out.println(list);

	}

}
