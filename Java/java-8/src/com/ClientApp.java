package com;

import java.util.List;

import com.model.Gender;
import com.model.Person;
import com.util.ItemsUtil;

public class ClientApp {

	public static void main(String[] args) {

		 List<Person> list = Person.getPersons();
		//
		// ItemsUtil.forEach(list, (p) -> {
		// System.out.println("item - " + p);
		// });
		//
		// System.out.println();
		//
		// List<Person> maleList = ItemsUtil.filter(list, (p) -> p.getGender() ==
		// Gender.MALE);
		//
		// ItemsUtil.forEach(maleList, (p) -> {
		// System.out.println(p);
		// });
		//
		// //
		// System.out.println();
		//
		// ItemsUtil.map(maleList, (p) -> {
		// p.setDob(p.getDob().plusYears(1));
		// return p;
		// });
		// //
		// ItemsUtil.forEach(maleList, (p) -> {
		// System.out.println(p);
		// });

		// ------------------------------------------------------------

		list.stream()
		.filter((p) -> {
			return p.getGender() == Gender.FEMALE;
		}).map((p) -> {
			p.setDob(p.getDob().plusYears(1));
			return p;
		}).forEach((p) -> {
			System.out.println(p);
		});

	}

}
