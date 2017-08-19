package com;

@FunctionalInterface
interface StringToIntMapper {
	int map(String str);
}

public class Lambda_Intro {

	public static void main(String[] args) {

		// StringToIntMapper mapper = (String str) -> {
		// return str.length() + 10;
		// };
		// System.out.println(mapper.map("Nag"));

		// -----------------------------------------------

		// Thread thread1 = new Thread(() -> {
		// System.out.println("im thred1");
		// });
		//
		// Thread thread2 = new Thread(() -> {
		// System.out.println("im thred2");
		// });

	}

}
