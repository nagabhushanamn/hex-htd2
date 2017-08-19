package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_API {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(2,1, 3, 5, 6, 8);

		IntStream s=integers.stream()
		.filter(n -> {
			System.out.println("filtering " + n);
			return n % 2 == 0;
		})
		.mapToInt(n->{
			System.out.println("mapping " + n);
			return n*n;
		})
		.limit(2);
		
		
		
		System.out.println(s.sum());

	}

}
