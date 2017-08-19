package com;


//-----------------------------------------------------
interface Collection {
	void add(String item);

	void clear();
}

interface List extends Collection {
	void add(int idx, String item);
}

interface Set extends Collection {

}
// -----------------------------------------------------

abstract class AbstractList implements List {
	@Override
	public void clear() {
	}
}

// -----------------------------------------------------

class ArrayList extends AbstractList {

	@Override
	public void add(String item) {
	}

	@Override
	public void add(int idx, String item) {
	}

}

class LinkedList extends AbstractList {
	@Override
	public void add(String item) {
	}

	@Override
	public void add(int idx, String item) {
	}
}

// -----------------------------------------------------

public class Q3 {
	public static void main(String[] args) {
		java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
	}

}
